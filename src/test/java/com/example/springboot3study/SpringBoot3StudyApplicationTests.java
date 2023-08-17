package com.example.springboot3study;

import com.example.springboot3study.dao.student.StudentDao;
import com.example.springboot3study.entity.Student;
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
        Student student = new Student();
        student.setName("账单");
        student.setPassword("123456");
        student.setAge(10);
        student.setMoney(10000);
        studentDao.save(student);
    }

}
