package com.example.inflearnspring.core;

import com.example.inflearnspring.core.domain.discount.DiscountPolicy;
import com.example.inflearnspring.core.domain.discount.FixDiscountPolicy;
import com.example.inflearnspring.core.domain.member.repository.MemberRepository;
import com.example.inflearnspring.core.domain.member.repository.MemoryMemberRepository;
import com.example.inflearnspring.core.domain.member.service.MemberService;
import com.example.inflearnspring.core.domain.member.service.MemberServiceImpl;
import com.example.inflearnspring.core.domain.order.service.OrderService;
import com.example.inflearnspring.core.domain.order.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
