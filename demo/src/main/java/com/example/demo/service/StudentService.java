package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }
}
