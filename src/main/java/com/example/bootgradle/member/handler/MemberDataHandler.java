package com.example.bootgradle.member.handler;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.repository.entity.MemberEntity;

import java.util.List;

public interface MemberDataHandler {
    MemberEntity create(MemberDto memberDto);
    List<MemberEntity> findAll();
}
