package com.springbootboilerplate.domain.member.repository;

import com.springbootboilerplate.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.domain.member.repository
 * fileName       : MemberRepository
 * author         : jinpyo
 * date           : 2024/04/03
 * description    :
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
