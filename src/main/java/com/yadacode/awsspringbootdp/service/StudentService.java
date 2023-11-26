package com.yadacode.awsspringbootdp.service;

import com.yadacode.awsspringbootdp.model.Student;
import com.yadacode.awsspringbootdp.model.StudentDTO;

import java.util.List;

public interface StudentService {

    public Student createNewStudent(StudentDTO studentDto);

    public List<Student> getStudents();
}
