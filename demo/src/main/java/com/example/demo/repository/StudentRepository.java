package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        //JPQL: java persistence query language
        String sql = "select s from Student s";
        TypedQuery<Student> query = entityManager.createQuery(sql, Student.class);
        return query.getResultList();
    }

    @Override
    public void addStudent(Student student) {;
    }
}
