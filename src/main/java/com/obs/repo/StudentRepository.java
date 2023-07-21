package com.obs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.obs.entity.Student;


@Service
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
