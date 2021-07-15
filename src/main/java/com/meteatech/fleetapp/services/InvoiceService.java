package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.Invoice;
import com.meteatech.fleetapp.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	
	//get invoices /invoices
	public List<Invoice> getInvoices(){
		return invoiceRepository.findAll();
	}
	
	//post new invoice
	public void save(Invoice invoice) {
		invoiceRepository.save(invoice);
	}
	
	//get by id
	public Optional<Invoice> findById(int id) {
		return invoiceRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 invoiceRepository.deleteById(id);
		}
}
