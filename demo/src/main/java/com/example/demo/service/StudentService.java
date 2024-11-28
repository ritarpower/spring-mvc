package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService implements IStudentService {
    private final IStudentRepository studentRepository= new StudentRepository();
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
