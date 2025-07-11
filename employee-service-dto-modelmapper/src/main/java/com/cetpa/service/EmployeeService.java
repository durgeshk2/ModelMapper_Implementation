package com.cetpa.service;

import java.util.List;

import com.cetpa.entity.Employee;
import com.cetpa.entity.dto.EmployeeDto;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	List<EmployeeDto> getList();

	EmployeeDto getEmployeeById(int eid);

}
