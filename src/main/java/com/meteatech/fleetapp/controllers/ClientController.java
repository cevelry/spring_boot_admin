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

import com.meteatech.fleetapp.models.Client;
import com.meteatech.fleetapp.models.Country;
import com.meteatech.fleetapp.models.State;
import com.meteatech.fleetapp.services.ClientService;
import com.meteatech.fleetapp.services.CountryService;
import com.meteatech.fleetapp.services.StateService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;

	@GetMapping("/clients")
	public String getClients(Model model) {

		model.addAttribute("clients", clientService.findAll());

		model.addAttribute("countries", countryService.findAll());
		
		model.addAttribute("states", stateService.findAll());

		return "client";
	}

	@PostMapping("/clients/addNew")
	public String addNew(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}

	@RequestMapping("clients/findById")
	@ResponseBody
	public Optional<Client> findById(int id) {
		return clientService.findById(id);

	}

	@RequestMapping(value = "/clients/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}

	@RequestMapping(value = "/clients/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		clientService.delete(id);
		return "redirect:/clients";
	}
	
	/*
	 * @Autowired private ClientService clientService;
	 * 
	 * @Autowired private CountryService countryService;
	 * 
	 * @Autowired private ClientService clientService;
	 * 
	 * //Get All Clients
	 * 
	 * @GetMapping("/clients") public String findAll(Model model){
	 * model.addAttribute("countries", countryService.findAll());
	 * model.addAttribute("clients", clientService.findAll());
	 * model.addAttribute("clients", clientService.findAll()); return "client"; }
	 * 
	 * @RequestMapping("clients/findById")
	 * 
	 * @ResponseBody public Optional<Client> findById(Integer id) { return
	 * clientService.findById(id); }
	 * 
	 * //Add Client
	 * 
	 * @PostMapping(value="clients/addNew") public String addNew(Client client) {
	 * clientService.save(client); return "redirect:/clients"; }
	 * 
	 * @RequestMapping(value="clients/update", method = {RequestMethod.PUT,
	 * RequestMethod.GET}) public String update(Client client) {
	 * clientService.save(client); return "redirect:/clients"; }
	 * 
	 * @RequestMapping(value="clients/delete", method = {RequestMethod.DELETE,
	 * RequestMethod.GET}) public String delete(Integer id) {
	 * clientService.delete(id); return "redirect:/clients"; }
	 */
	
}
