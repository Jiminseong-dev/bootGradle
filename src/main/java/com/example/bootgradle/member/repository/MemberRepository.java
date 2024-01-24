package com.example.bootgradle.member.repository;

import com.example.bootgradle.member.repository.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<MemberEntity,Long>{

    @Modifying(clearAutomatically = true)
    @Query("UPDATE MemberEntity SET email = :email, name = :name, phoneNumber = :phone_number, address = :address, detailAddress = :detail_address, postcode = :postcode, id = :id WHERE seq = :seq")
    int modifyMemberInfo(@Param("seq") Long seq,@Param("id") String id, @Param("name") String name,@Param("email") String email,@Param("address") String address, @Param("detail_address")String detail_address, @Param("postcode") String postcode,@Param("phone_number") String phone_number);
}
