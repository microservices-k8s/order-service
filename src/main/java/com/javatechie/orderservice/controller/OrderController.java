package com.javatechie.orderservice.controller;


import com.javatechie.orderservice.dto.OrderDto;
import com.javatechie.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto orderDto){

        OrderDto orderResponse = orderService.saveOrder(orderDto);

        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

}
