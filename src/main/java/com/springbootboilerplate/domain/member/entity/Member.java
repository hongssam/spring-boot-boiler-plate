package com.springbootboilerplate.domain.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.domain.member.entity
 * fileName       : Member
 * author         : jinpyo
 * date           : 2024/04/03
 * description    :
 */
@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;
}
