package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bo.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired 
	StudentService studservice;
	
	@GetMapping("/findAll")
	 public List<Student> findAll() {
	       return studservice.findAll();
	    }
	 
	@GetMapping("/findById")
	 public Optional<Student> findById(@PathVariable int id) {
	    	return studservice.findById(id);
	        
	    }

	
	
	
	
}
