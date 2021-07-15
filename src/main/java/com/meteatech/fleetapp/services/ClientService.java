package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Client;
import com.meteatech.fleetapp.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	//get clients /clients
	public List<Client>  findAll(){
		return clientRepository.findAll();
	}
	
	//post new client
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	//get by id
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 clientRepository.deleteById(id);
		}

}
