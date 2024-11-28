package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private static final List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"Minh Phuc", 25));
        students.add(new Student(2,"Phuoc Hoang", 22));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
}
