package com.cetpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entity.DepartmentEntity;
import com.cetpa.service.DepartmentService;
@RestController
@RequestMapping("department")
public class DepartmentController
{

	private DepartmentService departmentService;

	@Autowired
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	@PostMapping("add")
	public ResponseEntity<DepartmentEntity> addDepartment(@RequestBody DepartmentEntity department)
	{
		departmentService.saveDepartment(department);
		return ResponseEntity.status(HttpStatus.CREATED).body(department);
	}

}
