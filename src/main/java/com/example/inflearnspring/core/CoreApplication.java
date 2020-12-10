package com.example.inflearnspring.core;

import com.example.inflearnspring.core.member.Grade;
import com.example.inflearnspring.core.member.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
        Member member = new Member(1L, "yongjin", Grade.VIP);


    }

}
