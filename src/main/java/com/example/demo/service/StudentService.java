package com.example.demo.service;

import com.example.demo.bo.Lecturer;
import com.example.demo.bo.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

	List<Student> findAll();

	Optional<Student> findById(int id);

	@Query(value = "SELECT * FROM lecturers u WHERE u.experience_in_years >5", nativeQuery = true)
	List<Lecturer> findAlllect();
}
