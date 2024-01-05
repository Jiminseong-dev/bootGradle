package com.example.bootgradle.member.controller;

import com.example.bootgradle.member.controller.dto.JoinRequest;
import com.example.bootgradle.member.repository.entity.Member;
import com.example.bootgradle.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        List<Member> list = new ArrayList<>();
        list = memberService.findAll();
        modelAndView.addObject("member",list);
        return modelAndView;
    }

    @GetMapping("/member/createPage")
    public ModelAndView userInsertPage(){
        ModelAndView modelAndView = new ModelAndView("/member/memberCreate");
        return modelAndView;
    }

    @PostMapping("/member/create")
    public String userInsert(JoinRequest joinRequest){
        log.info(joinRequest.toString());
        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String phoneNumber = joinRequest.getPhoneNumber();
        String address = joinRequest.getAddress();
        String email = joinRequest.getEmail();
        String result = memberService.create(id,phoneNumber,address,name,email);
        if(result.equalsIgnoreCase("success")){
            return "sucess";
        }else{
            return "fail";
        }
    }
}
