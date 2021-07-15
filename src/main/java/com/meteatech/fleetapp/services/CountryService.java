package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Country;
import com.meteatech.fleetapp.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	//Get All Countrys
		public List<Country> findAll(){
			return countryRepository.findAll();
		}	
	
	//post new country
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	//get by id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 countryRepository.deleteById(id);
		}
	
	/*
	 * @Autowired private CountryRepository countryRepository;
	 */
	
	
	
	
	/*
	 * //Get All Countrys public List<Country> findAll(){ return
	 * countryRepository.findAll(); }
	 * 
	 * //Get Country By Id public Optional<Country> findById(int id) { return
	 * countryRepository.findById(id); }
	 * 
	 * //Delete Country public void delete(int id) {
	 * countryRepository.deleteById(id); }
	 * 
	 * //Update Country public void save( Country country) {
	 * countryRepository.save(country); }
	 */
}
