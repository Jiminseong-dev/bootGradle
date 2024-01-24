package com.example.bootgradle.member.handler;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.repository.entity.MemberEntity;

import java.lang.reflect.Member;
import java.util.List;

public interface MemberDataHandler {
    MemberEntity create(MemberDto memberDto);
    List<MemberEntity> findAll();
    MemberEntity getMemberInfo(Long id);

    int modifyMemberInfo(Long seq, String id, String name, String email,String address, String detail_address, String postcode,String phoneNumber);

    int memberDelete(Long seq);
}
