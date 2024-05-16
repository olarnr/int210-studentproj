package sit.int210.studentproj.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sit.int210.studentproj.entities.Student;
import sit.int210.studentproj.repositories.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> getStudents(){
        return repository.findAll();
    }
}
