package com.example.bootgradle.member.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class MemberDto {
    @Schema(description = "PK")
    private String id;

    @Schema(description = "사용자 핸드폰 번호")
    private String phoneNumber;
    @Schema(description = "사용자 이메일")
    private String email;
    @Schema(description = "사용자 이름")
    private String name;
    @Schema(description = "사용자 주소")
    private String address;
    @Schema(description = "상세 주소")
    private String detail_address;
    @Schema(description = "우편 번호")
    private String postcode;

}
