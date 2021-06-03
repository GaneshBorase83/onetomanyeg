package com.example.demo.viewm;

import java.util.Set;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;


public class EmployeeAdressviewm {
	private Employee employee;
	private Set<Address> address;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeAddressviewm [employee=" + employee + ", address=" + address + "]";
	}
	
}
