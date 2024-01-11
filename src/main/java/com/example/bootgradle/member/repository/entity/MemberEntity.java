package com.example.bootgradle.member.repository.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // 테이블과 매핑 Entity가 붙은 클래스는 JPA가 관리한다.
@Builder // 생성자를 이용하지 않고 builder를 이용함으로써 가독성 편리 순서 상관 없이 생성자를 호출 할 수 있다.
@Getter // private이기때문에 필드 직접접근 불가능 lombok의 필드의 접근
@NoArgsConstructor // 파라미터가 없는 디폴트 생성자를 생성
@AllArgsConstructor(access = AccessLevel.PROTECTED) // 모든 필드 값을 파라미터로 받는 생성자를 생성
@ToString
@Data
@Table(name = "member") // 테이블 명을 지정한다.
public class MemberEntity {

    @Id // pk 임을 지정한다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue 유일성
    // strategy = GenerationType.IDENTITY => auto_increment <- mysql용 오라클은 다름
    private Long index;

    private String id;
    private String email;
    private String phoneNumber;
    private String address;
    private String name;
}
