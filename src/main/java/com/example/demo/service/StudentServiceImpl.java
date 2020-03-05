package com.example.demo.service;

import com.example.demo.bo.Student;
import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	
    

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Optional<Student> findById(int id) {
        return Optional.empty();
    }

	
}
