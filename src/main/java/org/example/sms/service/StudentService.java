package org.example.sms.service;

import org.example.sms.model.StudentModel;
import org.example.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;


    public StudentService(StudentRepository repository){

        this.repository = repository;

    }

    // create
    public StudentModel addStudent(StudentModel student){

        return repository.save(student);

    }

    //display students

    public List<StudentModel> getStudent(){
        return repository.findAll();
    }

    public StudentModel updateStudent(String id , StudentModel student){

        StudentModel existingStudent = repository.findById(id).orElseThrow( () -> new RuntimeException("No student found with this id") );
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());

        return repository.save(existingStudent);
    }

    public String deleteStudent(String id){

        StudentModel student = repository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));

        repository.delete(student);

        return "Student deleted!";
    }
}
