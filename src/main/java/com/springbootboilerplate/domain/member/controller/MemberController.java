package com.springbootboilerplate.domain.member.controller;

import com.springbootboilerplate.domain.member.entity.Member;
import com.springbootboilerplate.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName    : com.domain.member.controller
 * fileName       : MemberController
 * author         : jinpyo
 * date           : 2024/04/03
 * description    :
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Member> findMember(){
        return memberService.findMember();

    }
}
