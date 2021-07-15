package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Contact;
import com.meteatech.fleetapp.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	
	//Get All Contacts
		public List<Contact> getContacts(){
			return contactRepository.findAll();
		}	
	
	//post new contact
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
	
	//get by id
	public Optional<Contact> findById(int id) {
		return contactRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 contactRepository.deleteById(id);
		}
}
