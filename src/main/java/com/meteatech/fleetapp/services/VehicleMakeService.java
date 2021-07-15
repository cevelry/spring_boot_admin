package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.VehicleMake;
import com.meteatech.fleetapp.models.VehicleMake;
import com.meteatech.fleetapp.repository.VehicleMakeRepository;
import com.meteatech.fleetapp.repository.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	
	//get vehicleMakes /vehicleMakes
	public List<VehicleMake> findAll(){
		return vehicleMakeRepository.findAll();
	}
	
	//post new vehicleMake
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	//get by id
	public Optional<VehicleMake> findById(int id) {
		return vehicleMakeRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 vehicleMakeRepository.deleteById(id);
		}
}
