package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Supplier;
import com.meteatech.fleetapp.repository.SupplierRepository;

@Service
public class SupplierService {


	@Autowired
	private SupplierRepository supplierRepository;
	
	
	//get suppliers /suppliers
	//Get All Suppliers
		public List<Supplier> findAll(){
			return supplierRepository.findAll();
		}
	
	//post new supplier
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}
	
	//get by id
	public Optional<Supplier> findById(int id) {
		return supplierRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 supplierRepository.deleteById(id);
		}
}
