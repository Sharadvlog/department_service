package com.dailycoder.departmentService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycoder.departmentService.entity.Department;
import com.dailycoder.departmentService.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository repo;

	public Department addDepartment(Department dept) {
		return repo.save(dept);
	}

	public Optional<Department> findByid(int id) {
		return Optional.of(repo.findById(id).orElse(null));
	}
	

}
