package com.example.springboot3study.service.student.imp;

import com.example.springboot3study.dao.student.StudentDao;
import com.example.springboot3study.entity.Student;
import com.example.springboot3study.entity.page.PageResp;
import com.example.springboot3study.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;


/**
 * @author 封心
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student getById(Long id) {
        return studentDao.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    /**
     * @param student
     * @param pageNumber
     * @param pageSize
     * @return
     */

    @Override
    public PageResp<Student> getPage(Student student, int pageNumber, int pageSize, String sort) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, Sort.Direction.ASC, sort.split(","));
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains())
                .withIgnorePaths("password");
        Example<Student> example = Example.of(student, matcher);
        Page<Student> studentPage = studentDao.findAll(example, pageable);
        return new PageResp<>(studentPage.getTotalPages(), (int) studentPage.getTotalElements(), studentPage.getNumber() + 1, studentPage.getContent());
    }
}
