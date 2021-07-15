package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.State;
import com.meteatech.fleetapp.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	
	//Get All States
		public List<State> findAll(){
			return stateRepository.findAll();
		}	
		
	
	//post new state
	public void save(State state) {
		stateRepository.save(state);
	}
	
	//get by id
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 stateRepository.deleteById(id);
		}
}
