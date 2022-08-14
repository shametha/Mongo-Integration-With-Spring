package com.example.demomongo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demomongo.services.StudentService;
import com.example.demomongo.entity.Student;

import java.util.List;

@RestController
@RequestMapping(value = "/student") // gives the link as http://localhost::8800/student
public class StudentController implements StudentService{

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable(value = "id" , required = false) int id) {
        return studentService.getStudent(id);
    }

    @Override
    public List<Student> getFirstName(String firstName) {
        return studentService.getFirstName(firstName);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(@PathVariable("id") int id) { // path variable will map the id coming from the request header and pass to the parameter
        studentService.deleteStudent(id);

    }
}
