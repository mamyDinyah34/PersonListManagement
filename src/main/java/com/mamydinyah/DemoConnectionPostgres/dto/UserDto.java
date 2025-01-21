package com.mamydinyah.DemoConnectionPostgres.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private int id;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String address;
}
