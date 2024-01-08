package com.example.bootgradle.member.dao.impl;

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
        memberRepository.save(memberEntity);
        return memberEntity;
    }

    @Override
    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }
}
