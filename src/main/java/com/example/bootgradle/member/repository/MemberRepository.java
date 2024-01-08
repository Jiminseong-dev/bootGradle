package com.example.bootgradle.member.repository;

import com.example.bootgradle.member.repository.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<MemberEntity,Long>{
}
