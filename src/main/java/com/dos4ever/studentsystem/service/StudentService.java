package com.dos4ever.studentsystem.service;

import com.dos4ever.studentsystem.model.Student;

import java.util.List;


public interface StudentService {

    public Student savestudent(Student student);
    public List<Student> getAllStudents();

}
