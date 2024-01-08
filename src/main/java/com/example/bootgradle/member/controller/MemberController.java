package com.example.bootgradle.member.controller;

import com.example.bootgradle.member.controller.dto.MemberDto;
import com.example.bootgradle.member.repository.entity.MemberEntity;
import com.example.bootgradle.member.service.MemberService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@Tag(name = "MemberController", description = "회원 관련 API")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public String index(Model model){
        List<MemberDto> memberDtoList = memberService.findAll();
        model.addAttribute("member",memberDtoList);
        return "index";
    }

    @GetMapping("/member/createPage")
    public ModelAndView userInsertPage(){
        ModelAndView modelAndView = new ModelAndView("/member/memberCreate");
        return modelAndView;
    }

    @PostMapping("/member/create")
    public String userInsert(MemberDto memberDto){
        log.info(memberDto.toString());
        String id = memberDto.getId();
        String name = memberDto.getName();
        String phoneNumber = memberDto.getPhoneNumber();
        String address = memberDto.getAddress();
        String email = memberDto.getEmail();
        memberService.create(id,phoneNumber,address,name,email);
        return "index";
    }
}
