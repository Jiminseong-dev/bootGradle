package com.example.bootgradle.member.handler.impl;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.dao.impl.MemberDaoImpl;
import com.example.bootgradle.member.handler.MemberDataHandler;

import com.example.bootgradle.member.repository.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberDataHandlerImpl implements MemberDataHandler {


    MemberDaoImpl memberDaoImpl;
    @Autowired
    public MemberDataHandlerImpl(MemberDaoImpl memberDaoImpl) {
        this.memberDaoImpl = memberDaoImpl;
    }

    @Override
    public MemberEntity create(String id, String phoneNumber, String address, String name, String email) {

        MemberEntity memberEntity = MemberEntity.builder()
                .id(id)
                .phoneNumber(phoneNumber)
                .address(address)
                .name(name)
                .email(email)
                .build();

        return memberDaoImpl.create(memberEntity);
    }
    @Override
    public List<MemberEntity> findAll() {
        return memberDaoImpl.findAll();
    }
}
