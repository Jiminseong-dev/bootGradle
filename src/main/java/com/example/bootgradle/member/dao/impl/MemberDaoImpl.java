package com.example.bootgradle.member.dao.impl;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.dao.MemberDao;
import com.example.bootgradle.member.repository.MemberRepository;
import com.example.bootgradle.member.repository.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberDaoImpl implements MemberDao {

    MemberRepository memberRepository;

    @Autowired
    public MemberDaoImpl (MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public MemberEntity create(MemberEntity memberEntity) {
        MemberEntity member = memberRepository.save(memberEntity);
        return member;
    }

    @Override
    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }
    @Override
    public MemberEntity getMemberInfo(Long id){
        return memberRepository.findById(id).orElse(null);
    }
    @Override
    public int modifyMemberInfo(Long seq, String id, String name, String email,String address, String detail_address, String postcode,String phoneNumber){
        int result = memberRepository.modifyMemberInfo(seq,id,name,email,address,detail_address,postcode,phoneNumber);
        return 1;
    }
    @Override
    public int memberDelete(Long seq){
        memberRepository.deleteById(seq);
        return 1;
    }
}
