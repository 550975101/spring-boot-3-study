package com.example.springboot3study.controller;

import com.example.springboot3study.entity.page.PageReq;
import com.example.springboot3study.entity.Student;
import com.example.springboot3study.entity.page.PageResp;
import com.example.springboot3study.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author 封心
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        try {
            studentService.deleteById(id);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            return ResponseEntity.ok("fail");
        }
    }

    @PostMapping("/")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        try {
            studentService.save(student);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            return ResponseEntity.ok("fail");
        }
    }

    @PutMapping("/")
    public ResponseEntity<String> updateStudent(@RequestBody Student student) {
        try {
            studentService.save(student);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            return ResponseEntity.ok("fail");
        }
    }

    @PostMapping("/page")
    public ResponseEntity<PageResp<Student>> getPage(@RequestBody PageReq<Student> pageRequest) {
        return ResponseEntity.ok(studentService.getPage(pageRequest.getPageData(), pageRequest.getPageNumber(), pageRequest.getPageSize(), pageRequest.getSort()));
    }
}
