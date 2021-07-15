package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.VehicleMaintenance;
import com.meteatech.fleetapp.models.VehicleMaintenance;
import com.meteatech.fleetapp.repository.VehicleMaintenanceRepository;
import com.meteatech.fleetapp.repository.VehicleMaintenanceRepository;

@Service
public class VehicleMaintenanceService {

	@Autowired
	private VehicleMaintenanceRepository vehicleMaintenanceRepository;
	
	
	//get vehicleMaintenances /vehicleMaintenances
	public List<VehicleMaintenance> getVehicleMaintenances(){
		return vehicleMaintenanceRepository.findAll();
	}
	
	//post new vehicleMaintenance
	public void save(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceRepository.save(vehicleMaintenance);
	}
	
	//get by id
	public Optional<VehicleMaintenance> findById(int id) {
		return vehicleMaintenanceRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 vehicleMaintenanceRepository.deleteById(id);
		}
}
