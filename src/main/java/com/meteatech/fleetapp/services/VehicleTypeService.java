package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Country;
import com.meteatech.fleetapp.models.VehicleType;
import com.meteatech.fleetapp.repository.VehicleTypeRepository;

@Service
public class VehicleTypeService {


	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	
	
	
	//Get All VehicleTypes
		public List<VehicleType> findAll(){
			return vehicleTypeRepository.findAll();
		}	
			
	
	//post new vehicleType
	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}
	
	//get by id
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 vehicleTypeRepository.deleteById(id);
		}

}
