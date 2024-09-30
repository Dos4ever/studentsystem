package com.dos4ever.studentsystem.Controller;

import com.dos4ever.studentsystem.model.Student;
import com.dos4ever.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.savestudent(student);
        return "new student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
    return studentService.getAllStudents();
    }
}
