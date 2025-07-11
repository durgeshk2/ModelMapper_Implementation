package com.cetpa.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Employee;
import com.cetpa.entity.dto.EmployeeDto;
import com.cetpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl  implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper mapper;
	
	public void saveEmployee(Employee employee) 
	{
		employeeRepository.save(employee);
		
	}



	public List<EmployeeDto> getList() {

		List<Employee> employeeList=employeeRepository.findAll();
		List<EmployeeDto> elist=employeeList.stream().map(emp->mapper.map(emp, EmployeeDto.class)).toList();
		return elist ;
	}

	public EmployeeDto getEmployeeById(int eid) {
		
		
		Employee employee =employeeRepository.findById(eid).orElse(null);
		EmployeeDto dto=mapper.map(employee, EmployeeDto.class);
		return (dto);
	}
	

}
