package com.meteatech.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meteatech.fleetapp.models.Country;
import com.meteatech.fleetapp.models.InvoiceStatus;
import com.meteatech.fleetapp.models.State;
import com.meteatech.fleetapp.services.CountryService;
import com.meteatech.fleetapp.services.InvoiceStatusService;
import com.meteatech.fleetapp.services.StateService;

@Controller
public class InvoiceStatusController {


		@Autowired
		private StateService stateService;
		
		@Autowired
		private CountryService countryService;
		
		@Autowired
		private InvoiceStatusService invoiceStatusService;
		
		
		
		//Get All InvoiceStatuss
		@GetMapping("invoiceStatuses")
		public String findAll(Model model){		
			model.addAttribute("invoiceStatuses", invoiceStatusService.findAll());
			return "invoiceStatus";
		}	
		
		/*
		 * @GetMapping("/invoiceStatuses") public String getStates(Model model) {
		 * 
		 * List<InvoiceStatus> invoiceStatus =
		 * invoiceStatusService.getInvoiceStatuses();
		 * 
		 * 
		 * 
		 * return "invoiceStatus"; }
		 */
		
		@PostMapping("/invoiceStatuses/addNew")
		public String addNew(InvoiceStatus invoiceStatus) {
			invoiceStatusService.save(invoiceStatus);
			return "redirect:/invoiceStatuses";
		}
		
		@RequestMapping("invoiceStatuses/findById")
		@ResponseBody
		public Optional<InvoiceStatus> findById(int id) {
			return invoiceStatusService.findById(id);
		
		}
		
		@RequestMapping(value = "/invoiceStatuses/update", method = { RequestMethod.PUT, RequestMethod.GET })
		public String update(InvoiceStatus invoiceStatus) {
			invoiceStatusService.save(invoiceStatus);
			return "redirect:/invoiceStatuses";
		}
		
		@RequestMapping(value = "/invoiceStatuses/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
		public String delete(Integer id) {
			invoiceStatusService.delete(id);
			return "redirect:/invoiceStatuses";
		}

		public StateService getStateService() {
			return stateService;
		}

		public void setStateService(StateService stateService) {
			this.stateService = stateService;
		}

		public CountryService getCountryService() {
			return countryService;
		}

		public void setCountryService(CountryService countryService) {
			this.countryService = countryService;
		}

		public InvoiceStatusService getInvoiceStatusService() {
			return invoiceStatusService;
		}

		public void setInvoiceStatusService(InvoiceStatusService invoiceStatusService) {
			this.invoiceStatusService = invoiceStatusService;
		}
		
		

}
