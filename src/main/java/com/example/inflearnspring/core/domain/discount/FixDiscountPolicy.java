package com.example.inflearnspring.core.domain.discount;

import com.example.inflearnspring.core.domain.member.Grade;
import com.example.inflearnspring.core.domain.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? 1000 : 0;
    }
}
