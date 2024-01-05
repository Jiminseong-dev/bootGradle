package com.example.bootgradle.member.service;

import com.example.bootgradle.member.controller.dto.JoinRequest;
import com.example.bootgradle.member.repository.MemberRepository;
import com.example.bootgradle.member.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // 클래스에 선언된 final변수들, 필드들을 매개변수로 하는 생성자를 자동으로 생성해주는 어노테이션
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    @Override
    public String create(String id, String phoneNumber, String address, String name, String email) {
        Member member = Member.builder()
                .id(id)
                .phoneNumber(phoneNumber)
                .address(address)
                .name(name)
                .email(email)
                .build();
        memberRepository.save(member);
        return "success";
    }

    @Override
    public List<Member> findAll() {
        List<Member> list = memberRepository.findAll();
        return list;
    }
}
