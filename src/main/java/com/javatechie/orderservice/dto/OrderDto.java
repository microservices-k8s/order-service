package com.javatechie.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Integer orderId;
    private List<FoodItemsDto> foodItemsDto;
    private Restaurant restaurant;
    private UserDto userDto;
}
