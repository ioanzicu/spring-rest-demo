package com.ioan.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ioan.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	// define endpoint for "/students" - return list of students

	@GetMapping("/students")
	public List<Student> getStudent() {

		List<Student> theStudents = new ArrayList<>();

		theStudents.add(new Student("Sonia", "Kage"));
		theStudents.add(new Student("Johny", "Kage"));
		theStudents.add(new Student("Shau", "Khan"));

		return theStudents;
	}
}
