package com.example.bootgradle.member.controller.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDto {
    private String id;
    private String phoneNumber;
    private String email;
    private String name;
    private String address;

}
