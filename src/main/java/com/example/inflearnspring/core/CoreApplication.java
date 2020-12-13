package com.example.inflearnspring.core;

import com.example.inflearnspring.core.domain.member.Grade;
import com.example.inflearnspring.core.domain.member.Member;
import com.example.inflearnspring.core.domain.member.service.MemberService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        memberService.join(new Member(1L, "yongjin", Grade.VIP));
        Member member = memberService.findMember(1L);
        System.out.println("member = " + member);
    }

}
