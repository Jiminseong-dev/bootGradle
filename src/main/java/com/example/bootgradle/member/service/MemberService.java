package com.example.bootgradle.member.service;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.repository.entity.MemberEntity;

import java.util.List;

public interface MemberService {
    MemberDto create(String id, String phoneNumber, String address, String name, String email);
    List<MemberDto> findAll();
}
