package com.springbootboilerplate.domain.member.service;

import com.springbootboilerplate.domain.member.entity.Member;
import com.springbootboilerplate.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName    : com.domain.member.service
 * fileName       : MemberService
 * author         : jinpyo
 * date           : 2024/04/03
 * description    :
 */
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public List<Member> findMember() {

        return memberRepository.findAll();
    }
}
