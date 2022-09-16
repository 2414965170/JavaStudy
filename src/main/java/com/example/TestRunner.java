package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner , Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("TestRunner启动成功！");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
