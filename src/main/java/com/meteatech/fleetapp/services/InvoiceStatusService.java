package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.InvoiceStatus;
import com.meteatech.fleetapp.repository.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
	
	//Get All InvoiceStatuss
		public List<InvoiceStatus> findAll(){
			return invoiceStatusRepository.findAll();
		}	
	
	
	//get invoiceStatuss /invoiceStatuss
	public List<InvoiceStatus> getInvoiceStatuses(){
		return invoiceStatusRepository.findAll();
	}
	
	//post new invoiceStatus
	public void save(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}
	
	//get by id
	public Optional<InvoiceStatus> findById(int id) {
		return invoiceStatusRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 invoiceStatusRepository.deleteById(id);
		}
}
