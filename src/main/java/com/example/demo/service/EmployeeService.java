package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.repository.Adressrepository;
import com.example.demo.repository.Emprepository;
import com.example.demo.viewm.EmployeeAdressviewm;





@Service
public class EmployeeService {
	@Autowired
	private Emprepository emprepository;
	@Autowired
	private Adressrepository adressrepository;
	
	public List<Employee> getEmployees(){
		List<Employee> employees=emprepository.findAll();
		return employees;
	}
	
	public EmployeeAdressviewm save(EmployeeAdressviewm EmployeeAdressviewm) {
		Employee employee=EmployeeAdressviewm.getEmployee();
		emprepository.save(employee);
		for(Address address : EmployeeAdressviewm.getAddress()) {
			address.setEmployee(employee);
			adressrepository.save(address);
		}
		return EmployeeAdressviewm;
	}
}
