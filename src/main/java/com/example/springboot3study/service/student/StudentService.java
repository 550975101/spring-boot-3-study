package com.example.springboot3study.service.student;

import com.example.springboot3study.entity.Student;
import com.example.springboot3study.entity.page.PageResp;
import org.springframework.stereotype.Service;

/**
 * @author 封心
 */
@Service
public interface StudentService {

    /**
     * 根据id查询学生信息
     *
     * @param id
     * @return
     */
    Student getById(Long id);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    void deleteById(Long id);

    /**
     * 保存
     *
     * @param student
     */
    void save(Student student);

    public PageResp<Student> getPage(Student student, int pageNumber, int pageSize, String sort);
}
