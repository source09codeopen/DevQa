package com.yadacode.awsspringbootdp.repository;

import com.yadacode.awsspringbootdp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
