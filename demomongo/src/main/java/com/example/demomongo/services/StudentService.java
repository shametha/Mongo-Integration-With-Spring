package com.example.demomongo.services;

import com.example.demomongo.entity.Student;

import java.util.List;


public interface StudentService {
        Student getStudent(int id);
        List<Student> getFirstName(String firstName);
        Student saveStudent(Student student);
        void deleteStudent(int id);
        //int countStudent(String firstName);

    }

