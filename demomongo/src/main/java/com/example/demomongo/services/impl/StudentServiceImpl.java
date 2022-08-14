package com.example.demomongo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demomongo.repository.StudentRepository;
import com.example.demomongo.services.StudentService;
import com.example.demomongo.entity.Student;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return (optionalStudent.isPresent()?optionalStudent.get():null);
    }

    @Override
    public List<Student> getFirstName(String firstName){
        List<Student> optionalStudent = studentRepository.findbyFirstName(firstName);
        return (optionalStudent.isEmpty()?null:optionalStudent);
    }

//    @Override
//    public int countStudent(String firstName){
//        return studentRepository.countOfStudents(firstName);
//    }

    @Override
    public Student saveStudent(Student student) {

        return  studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);

    }
}
