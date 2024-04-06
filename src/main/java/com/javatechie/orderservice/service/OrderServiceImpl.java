package com.javatechie.orderservice.service;


import com.javatechie.orderservice.dto.OrderDto;
import com.javatechie.orderservice.dto.UserDto;
import com.javatechie.orderservice.entity.Order;
import com.javatechie.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    private final RestTemplate restTemplate;

    private final SequenceGenerator sequenceGenerator;

    @Override
    public OrderDto saveOrder(OrderDto orderDto) {

        Integer newOrderId = sequenceGenerator.generateNextOrderId();

        UserDto userDto = fetchUserDetailsFromUserId(orderDto.getUserDto().getUserId());

        Order orderToBeSaved = new Order(newOrderId, orderDto.getFoodItemsDto(), orderDto.getRestaurant(), userDto);

        Order savedOrder = orderRepository.save(orderToBeSaved);

        return new OrderDto(savedOrder.getOrderId(), savedOrder.getFoodItemsDto(), savedOrder.getRestaurant(), savedOrder.getUserDto());
    }

    private UserDto fetchUserDetailsFromUserId(Integer userId) {
        return restTemplate.getForObject("http://USER-SERVICE/api/v1/user/fetchById/" + userId, UserDto.class);
    }
}
