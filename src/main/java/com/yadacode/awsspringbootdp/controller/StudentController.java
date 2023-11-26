package com.yadacode.awsspringbootdp.controller;

import com.yadacode.awsspringbootdp.model.Student;
import com.yadacode.awsspringbootdp.model.StudentCreateRequestModel;
import com.yadacode.awsspringbootdp.model.StudentCreateResponseModel;
import com.yadacode.awsspringbootdp.model.StudentDTO;
import com.yadacode.awsspringbootdp.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/")
    public ResponseEntity<Object> createNewStudent(@RequestBody StudentCreateRequestModel studentRequest){

        StudentDTO studentDto = StudentDTO.builder()
                .firstName(studentRequest.getFirstName())
                .lastName(studentRequest.getLastName())
                .age(studentRequest.getAge())
                .gender(studentRequest.getGender())
                .build();

        Student newStudent = studentService.createNewStudent(studentDto);

        return ResponseEntity.ok().body(newStudent);
    }

    @GetMapping("/")
    public ResponseEntity<Object> getAllStudents(){

        return ResponseEntity.ok().body(studentService.getStudents());
    }
}
