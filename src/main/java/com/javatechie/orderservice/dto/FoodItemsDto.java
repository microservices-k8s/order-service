package com.javatechie.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemsDto {

    private int id;
    private String itemName;
    private String itemDescription;
    private String isVeg;
    private Number price;
    private Integer restaurantId;
    private Integer quantity;
}
