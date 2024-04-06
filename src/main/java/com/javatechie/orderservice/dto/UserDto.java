package com.javatechie.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private int userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
}
