package com.example.inflearnspring.core.domain.order.service;

import com.example.inflearnspring.core.domain.discount.DiscountPolicy;
import com.example.inflearnspring.core.domain.member.Member;
import com.example.inflearnspring.core.domain.member.repository.MemberRepository;
import com.example.inflearnspring.core.domain.order.Order;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
