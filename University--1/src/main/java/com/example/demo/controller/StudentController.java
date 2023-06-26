package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/Student")
public class StudentController {
	    @Autowired
	    private StudentService service;

	
	 @GetMapping("/{name}") 
	 public Student searchByName(String name)
	 {
		 return service.serchByName(name);
	 }
	
	
	
	
}
