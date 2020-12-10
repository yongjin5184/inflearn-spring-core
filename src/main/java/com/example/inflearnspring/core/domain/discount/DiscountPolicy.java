package com.example.inflearnspring.core.domain.discount;

import com.example.inflearnspring.core.domain.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
