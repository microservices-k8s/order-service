package com.javatechie.orderservice.service;

import com.javatechie.orderservice.dto.OrderDto;

public interface OrderService {
    OrderDto saveOrder(OrderDto orderDto);
}
