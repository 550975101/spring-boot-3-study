package com.example.springboot3study.dao.student;

import com.example.springboot3study.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 封心
 */
@Repository
public interface StudentDao extends JpaRepository<Student, Long> {
}
