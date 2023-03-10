package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
@Autowired
ApiService service;
@PostMapping("/student")
public boolean add(@RequestBody Student student) {
return service.addStudent(student);
}
@GetMapping("/student")
public List<Student> getStudent(){
return service.getStudent();
}
@GetMapping("/student/{id}")
public Optional<Student> getStudentById(@PathVariable int id){
return service.getStudentById(id);
}
@PutMapping("/student/{id}")
public Student update(@RequestBody Student student) {
return service.updateStudent(student);
}
@DeleteMapping("/student/{id}")
public boolean delete(@RequestParam int id) {
return service.deleteStudentById(id);
}
}
