package com.example.inflearnspring.core.repository;

import com.example.inflearnspring.core.member.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
