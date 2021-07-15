package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Location;
import com.meteatech.fleetapp.models.Location;
import com.meteatech.fleetapp.repository.LocationRepository;
import com.meteatech.fleetapp.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	
	public List<Location> findAll() {
		return (List<Location>) locationRepository.findAll();
	}
	
	//post new location
	public void save(Location location) {
		locationRepository.save(location);
	}
	
	//get by id
	public Optional<Location> findById(int id) {
		return locationRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 locationRepository.deleteById(id);
		}
}