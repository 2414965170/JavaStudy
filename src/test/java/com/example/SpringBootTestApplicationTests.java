package com.example;

import com.example.student.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Resource
    Student student;

    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
