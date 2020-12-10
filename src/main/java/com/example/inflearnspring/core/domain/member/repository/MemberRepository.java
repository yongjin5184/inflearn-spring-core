package com.example.inflearnspring.core.domain.member.repository;

import com.example.inflearnspring.core.domain.member.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
