package com.example.demomongo.repository;

import com.example.demomongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {
    List<Student> findbyFirstName(String firstName);

//    @Query(value = "{firstName = ?0}}",count = true ) // ? is a regular expression
//    int countOfStudents(String firstName);
}
