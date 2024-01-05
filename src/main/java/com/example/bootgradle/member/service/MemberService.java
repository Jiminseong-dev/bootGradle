package com.example.bootgradle.member.service;

import com.example.bootgradle.member.repository.entity.Member;

import java.util.List;

public interface MemberService {
    String create(String id, String phoneNumber,String address, String name, String email);
    List<Member> findAll();
}
