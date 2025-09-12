package com.learning.controller;

import com.learning.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import com.learning.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {

    @Autowired //default wiring mode is by type
    private StudentService studentServiceTest;

    @Autowired
    @Qualifier("student2")
    private Student student;

    @GetMapping("/student/healthCheck")
    public ResponseEntity<String> healthCheck(){
        log.info("Info logs for health Check End Point");
        log.debug("Debug logs for health Check End Point");
        log.warn("Warning logs for health Check End Point");
        log.error("Error logs for health Check End Point");
        return new ResponseEntity<>("Student Controller Is Up & Running !!!", HttpStatus.OK);
    }

    @GetMapping(value = "/student/isDbUp")
    public ResponseEntity<Boolean> isDbUp(){
        return new ResponseEntity<>(studentServiceTest.isDbUp(), HttpStatus.OK);
    }


    @GetMapping(value = "/student/fetch-student", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> fetchStudent(@RequestBody int studentId){
        return new ResponseEntity<>(studentServiceTest.fetchStudent(studentId), HttpStatus.OK);
    }

    @PostMapping(value = "/student/add-student", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentServiceTest.addStudent(student), HttpStatus.OK);
    }


}
