package com.example.bootgradle.member.controller.dto;

import lombok.Data;
import lombok.ToString;

@Data
public class JoinRequest {
    private String id;
    private String phoneNumber;
    private String email;
    private String name;
    private String address;
}
