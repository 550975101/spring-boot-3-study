package com.example.springboot3study;

import com.example.springboot3study.dao.student.StudentDao;
import com.example.springboot3study.service.student.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot3StudyApplicationTests {

    @Autowired
    private StudentDao studentDao;

    @Test
    void contextLoads() {
        String name = studentDao.findById(7L).get().getName();
        System.out.println(name);
    }

}
