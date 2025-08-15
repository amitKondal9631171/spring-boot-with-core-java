package org.school.service.impl;

import org.school.entity.Student;
import org.school.repository.StudentRepository;
import org.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@Transactional
@Lazy
public class StudentServiceImpl implements StudentService {

    static String currentDateTime;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean isDbUp(){
        return studentRepository.isDbUp();
    }

    public boolean addStudent(Student student){
        return studentRepository.addStudent(student);
    }

    @Override
    public boolean addStudentInBulk(List<Student> student) {
        return false;
    }

    @Override
    public Student fetchStudent(int studentId) {
        return null;
    }

    @Override
    public boolean updateStudent(Student studentInfo) {
        return false;
    }

    @Override
    public boolean deleteStudent(int studentId) {
        return false;
    }

    @Override
    public List<Student> fetchAllStudent() {
        return null;
    }

    @Override
    public List<Student> fetchStudentOrderByName() {
        return null;
    }

    @Override
    public List<Student> fetchStudentOrderByRollNumber() {
        return null;
    }

    @Override
    //@Async("balanceExecutor")
    public List<String> processOtherProducts(List<String> input) {
        input.forEach(value -> {
                    currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    System.out.println(Thread.currentThread() + " Other executed on: " + currentDateTime);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
        );

        return input;
    }

    @Override
    //@Async("balanceExecutor")
    public List<String> processTreadAndFinanceProducts(List<String> input) {
        input.forEach(value -> {
                    currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    System.out.println(Thread.currentThread() + " Trade executed on: " + currentDateTime);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
        );
        return input;
    }

}
