package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Employee;
import com.meteatech.fleetapp.models.EmployeeType;
import com.meteatech.fleetapp.repository.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {

	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
	
	
	//get employeeTypes /employeeTypes
		public List<EmployeeType> findAll(){
			return employeeTypeRepository.findAll();
		}
	
	//post new employeeType
	public void save(EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}
	
	//get by id
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 employeeTypeRepository.deleteById(id);
		}
}
