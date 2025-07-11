package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entity.Employee;
import com.cetpa.entity.dto.EmployeeDto;
import com.cetpa.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	//http://localhost:8080/employee/add
	@PostMapping("add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}
	//http://localhost:8080/employee/list
	@GetMapping("list")
	public ResponseEntity<List<EmployeeDto>> getEmployeeList()
	{
		List<EmployeeDto> employeeList=employeeService.getList();
		return ResponseEntity.ok(employeeList);
	}
	//http://localhost:8080/employee/details/byid/eid
	@GetMapping("details/byid/{eid}")
	public ResponseEntity<EmployeeDto> getEmployeeDetaisById(@PathVariable int eid)
	{
		EmployeeDto employeeDto=employeeService.getEmployeeById(eid);
		if(employeeDto==null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(employeeDto);
		
	}

}
