package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.VehicleStatus;
import com.meteatech.fleetapp.models.VehicleStatus;
import com.meteatech.fleetapp.repository.VehicleStatusRepository;
import com.meteatech.fleetapp.repository.VehicleStatusRepository;

@Service
public class VehicleStatusService {

	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;
	
	
	//get vehicleStatuss /vehicleStatuss
	public List<VehicleStatus> findAll(){
		return vehicleStatusRepository.findAll();
	}
	
	//post new vehicleStatus
	public void save(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}
	
	//get by id
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 vehicleStatusRepository.deleteById(id);
		}

}
