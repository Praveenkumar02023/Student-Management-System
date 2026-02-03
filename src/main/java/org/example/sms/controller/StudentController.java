package org.example.sms.controller;

import org.example.sms.dto.StudentRequestDto;
import org.example.sms.dto.StudentResponseDto;
import org.example.sms.model.StudentModel;
import org.example.sms.service.StudentService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {

        this.service = service;

    }

    @PostMapping("/add-student")
    public StudentResponseDto addStudent(@RequestBody @Valid StudentRequestDto student) {

        return service.addStudent(student);

    }

    @GetMapping("/students")
    public List<StudentResponseDto> getStudents() {
        return service.getStudent();
    }

    @PutMapping("/update/{id}")
    public StudentResponseDto updateStudent(@PathVariable String id, @RequestBody @Valid StudentRequestDto student) {

        return service.updateStudent(id, student);

    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id) {

        return service.deleteStudent(id);

    }
}
