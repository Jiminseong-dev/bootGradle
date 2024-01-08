package com.example.bootgradle.member.service.impl;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.handler.impl.MemberDataHandlerImpl;
import com.example.bootgradle.member.repository.MemberRepository;
import com.example.bootgradle.member.repository.entity.MemberEntity;
import com.example.bootgradle.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    MemberDataHandlerImpl memberDataHandler;

    @Autowired
    public MemberServiceImpl(MemberDataHandlerImpl memberDataHandler) {
        this.memberDataHandler = memberDataHandler;
    }
    @Override
    public MemberDto create(String id, String phoneNumber, String address, String name, String email) {

        MemberEntity memberEntity = memberDataHandler.create(id, phoneNumber, address, name, email);
        return new MemberDto(memberEntity.getId(),memberEntity.getPhoneNumber(),memberEntity.getAddress(),memberEntity.getName(),memberEntity.getEmail());
    }

    @Override
    public List<MemberDto> findAll() {
        List<MemberEntity> memberEntityList = memberDataHandler.findAll();
        List<MemberDto> memberDtoList = memberEntityList.stream().map(memberEntity -> new MemberDto(memberEntity.getId(),memberEntity.getPhoneNumber(),memberEntity.getAddress(),memberEntity.getName(),memberEntity.getEmail())).toList();
        return memberDtoList;
    }
}
