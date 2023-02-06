
package com.iamneo.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.springboot.model.Student;
import com.iamneo.springboot.service.StudentService;

@RestController
public class ApiController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String Welcome() {
		return "Welcome to spring boot";
	}

	@GetMapping("/students")
	public List<Student> retrieveAllStudents(){	
	return studentService.getAllStudents();
	}
}
