package com.dailycoder.departmentService.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycoder.departmentService.entity.Department;
import com.dailycoder.departmentService.service.DepartmentService;

@RestController

public class DeparmentController {

	
	
	@Autowired
	DepartmentService service;
	
	@PostMapping("/savedepartment")
	public Department saveDepartment(@RequestBody Department dept) {
		return service.addDepartment(dept);
	}
	
	@GetMapping("/getdepartment/{id}")
	public Optional<Department> findDepartment(@PathVariable("id") int id) {
		return service.findByid(id);
	}

}
