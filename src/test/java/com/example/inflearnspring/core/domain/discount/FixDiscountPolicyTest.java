package com.example.inflearnspring.core.domain.discount;

import com.example.inflearnspring.core.AppConfig;
import com.example.inflearnspring.core.domain.member.Grade;
import com.example.inflearnspring.core.domain.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixDiscountPolicyTest {

    private DiscountPolicy discountPolicy;

    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        discountPolicy = appConfig.discountPolicy();
    }

    @Test
    @DisplayName("VIP는 10프로 할인이 적용되어야 한다.")
    void vip_o() {
        //given
        Member findMember = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int discount = discountPolicy.discount(findMember, 10000);

        //then
        assertEquals(discount, 1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void vip_x() {
        //given
        Member findMember = new Member(1L, "memberBASIC", Grade.BASIC);

        //when
        int discount = discountPolicy.discount(findMember, 10000);

        //then
        assertEquals(discount, 0);
    }
}