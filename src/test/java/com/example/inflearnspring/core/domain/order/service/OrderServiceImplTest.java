package com.example.inflearnspring.core.domain.order.service;

import com.example.inflearnspring.core.AppConfig;
import com.example.inflearnspring.core.domain.member.Grade;
import com.example.inflearnspring.core.domain.member.Member;
import com.example.inflearnspring.core.domain.member.service.MemberService;
import com.example.inflearnspring.core.domain.order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    private MemberService memberService;
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    @DisplayName("회원등급이 VIP인 회원이 생성한 주문은 할인이 되어야 한다.")
    void createOrder() {
        memberService.join(new Member(1L, "memberA", Grade.VIP));

        Member member = memberService.findMember(1L);

        Order order = orderService.createOrder(member.getId(), "itemA", 10000);

        assertEquals(order.getDiscountPrice(), 1000);
    }
}