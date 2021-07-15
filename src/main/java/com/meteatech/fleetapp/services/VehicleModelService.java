package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.VehicleModel;
import com.meteatech.fleetapp.repository.VehicleModelRepository;

@Service
public class VehicleModelService {

	@Autowired
	private VehicleModelRepository vehicleModelRepository;
	
	
	
	
	//Get All VehicleModels
		public List<VehicleModel> findAll(){
			return vehicleModelRepository.findAll();
		}	
		
	
	//post new vehicleModel
	public void save(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}
	
	//get by id
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 vehicleModelRepository.deleteById(id);
		}

}
