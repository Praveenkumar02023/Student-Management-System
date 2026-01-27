package org.example.sms.controller;

import org.example.sms.model.StudentModel;
import org.example.sms.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){

        this.service = service;

    }

//   create function API
    @PostMapping("add-student/")
    public StudentModel addStudent(@RequestBody StudentModel student){

        return service.addStudent(student);

    }

    @GetMapping("/students")
    public List<StudentModel> getStudents(){
        return service.getStudent();
    }

    @PutMapping("/update/{id}")
    public StudentModel updateStudent(@PathVariable String id , @RequestBody StudentModel student){

        return service.updateStudent(id,student);

    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id){

        return service.deleteStudent(id);

    }
}
