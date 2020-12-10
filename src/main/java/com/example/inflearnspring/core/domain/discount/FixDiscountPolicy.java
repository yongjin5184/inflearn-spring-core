package com.example.inflearnspring.core.domain.discount;

import com.example.inflearnspring.core.domain.member.Grade;
import com.example.inflearnspring.core.domain.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private static final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? price * discountPercent / 100 : 0;
    }
}
