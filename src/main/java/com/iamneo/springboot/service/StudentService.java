package com.iamneo.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iamneo.springboot.model.Student;

@Service
public class StudentService {
	
	private static final List<Student> students = new ArrayList<>();
	
	static {
		Student student1= new Student("Venky", "Iamneo", "Hiker, Programmer and Architect");
		Student student2= new Student("Iamneo", "Iamneo", "Hiker, Programmer and Architect");
		students.add(student1);
		students.add(student2);
		System.out.println(students);
	}
	
	public List<Student> getAllStudents(){
		return students;
	}
}
