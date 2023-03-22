package com.example.finalprojectspring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Priit Enno
 * @ Date 22.03.2023
 */
public class Car {
    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        try {
            Student searchStudent = studentService.findStudentByName(student.getName());
            throw new RuntimeException("Student already exists! Cannot create this student!");
        } catch (StudentNotFoundException e) {
            studentService.createStudent(student);
            return new ResponseEntity<>(HttpStatus.CREATED);


}
