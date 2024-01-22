package com.example.bootgradle.member.dao;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.repository.entity.MemberEntity;

import java.util.List;

public interface MemberDao {
    MemberEntity create(MemberEntity memberEntity);
    List<MemberEntity> findAll();
    MemberEntity modify(Long id);
}
