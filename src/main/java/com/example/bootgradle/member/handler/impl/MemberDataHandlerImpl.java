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
    public MemberEntity create(MemberDto memberDto) {

        MemberEntity memberEntity = MemberEntity.builder()
                .id(memberDto.getId())
                .phoneNumber(memberDto.getPhoneNumber())
                .address(memberDto.getAddress())
                .name(memberDto.getName())
                .email(memberDto.getEmail())
                .detailAddress(memberDto.getDetail_address())
                .postcode(memberDto.getPostcode())
                .build();
        return memberDaoImpl.create(memberEntity);
    }
    @Override
    public List<MemberEntity> findAll() {
        return memberDaoImpl.findAll();
    }
    @Override
    public MemberEntity getMemberInfo(Long id) {
        return memberDaoImpl.getMemberInfo(id);
    }
    @Override
    public int modifyMemberInfo(Long seq, String id, String name, String email,String address, String detail_address, String postcode,String phoneNumber) {
        return memberDaoImpl.modifyMemberInfo(seq,id,name,email,address,detail_address,postcode,phoneNumber);
    }
    @Override
    public int memberDelete(Long seq){
        return memberDaoImpl.memberDelete(seq);
    }

}
