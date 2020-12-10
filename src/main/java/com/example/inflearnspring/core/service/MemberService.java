package com.example.inflearnspring.core.service;

import com.example.inflearnspring.core.member.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
