package com.example.inflearnspring.core.domain.member.service;

import com.example.inflearnspring.core.domain.member.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
