package com.javatechie.orderservice.entity;

import com.javatechie.orderservice.dto.FoodItemsDto;
import com.javatechie.orderservice.dto.Restaurant;
import com.javatechie.orderservice.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

    private Integer orderId;
    private List<FoodItemsDto> foodItemsDto;
    private Restaurant restaurant;
    private UserDto userDto;
}
