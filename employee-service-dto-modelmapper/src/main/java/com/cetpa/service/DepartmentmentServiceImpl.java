package com.cetpa.service;


import org.springframework.stereotype.Service;

import com.cetpa.entity.DepartmentEntity;
import com.cetpa.repository.DepartmentRepository;

@Service
public class DepartmentmentServiceImpl implements DepartmentService
{
	
private DepartmentRepository departmentRepository;

	public DepartmentmentServiceImpl(DepartmentRepository departmentRepository) 
	{
		
		this.departmentRepository = departmentRepository;
	}


	public void saveDepartment(DepartmentEntity department) {
	departmentRepository.save(department);
		
	}
	
}
