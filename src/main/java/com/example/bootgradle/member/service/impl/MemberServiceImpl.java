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
    public int create(MemberDto memberDto) {


        MemberEntity memberEntity = memberDataHandler.create(memberDto);
        if(memberEntity == null){
            return 0;
        }
        return 1;
    }

    @Override
    public List<MemberDto> findAll() {
        List<MemberEntity> memberEntityList = memberDataHandler.findAll();
        List<MemberDto> memberDtoList = memberEntityList.stream().map(memberEntity -> new MemberDto().builder()
                .index(String.valueOf(memberEntity.getIndex()))
                .id(memberEntity.getId())
                .phoneNumber(memberEntity.getPhoneNumber())
                .address(memberEntity.getAddress())
                .name(memberEntity.getName())
                .email(memberEntity.getEmail())
                .postcode(memberEntity.getPostcode())
                .build()).toList();
        return memberDtoList;
    }
    @Override
    public MemberDto modify(Long id) {

        MemberEntity memberEntity = memberDataHandler.modify(id);

        MemberDto resultMemberDto = MemberDto.builder()
                .index(String.valueOf(memberEntity.getIndex()))
                .id(memberEntity.getId())
                .name(memberEntity.getName())
                .email(memberEntity.getEmail())
                .detail_address(memberEntity.getDetailAddress())
                .postcode(memberEntity.getPostcode())
                .email(memberEntity.getEmail())
                .address(memberEntity.getAddress())
                .phoneNumber(memberEntity.getPhoneNumber())
                .build();
        return resultMemberDto;
    }
}
