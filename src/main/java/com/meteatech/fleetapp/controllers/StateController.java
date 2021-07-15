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
import com.meteatech.fleetapp.models.State;
import com.meteatech.fleetapp.services.CountryService;
import com.meteatech.fleetapp.services.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;

	@GetMapping("/states")
	public String getStates(Model model) {

		List<State> stateList = stateService.findAll();
		model.addAttribute("states", stateList);

		List<Country> countryList = countryService.findAll();
		model.addAttribute("countries", countryList);

		return "state";
	}

	@PostMapping("/states/addNew")
	public String addNew(State state) {
		stateService.save(state);
		return "redirect:/states";
	}

	@RequestMapping("states/findById")
	@ResponseBody
	public Optional<State> findById(int id) {
		return stateService.findById(id);

	}

	@RequestMapping(value = "/states/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(State state) {
		stateService.save(state);
		return "redirect:/states";
	}

	@RequestMapping(value = "/states/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		stateService.delete(id);
		return "redirect:/states";
	}

	// Add State

	/*
	 * @Autowired private StateService stateService;
	 * 
	 * @Autowired private StateService stateService;
	 * 
	 * //Get All States
	 * 
	 * @GetMapping("states") public String findAll(Model model){
	 * model.addAttribute("states", stateService.findAll());
	 * model.addAttribute("states", stateService.findAll()); return "state"; }
	 * 
	 * @RequestMapping("states/findById")
	 * 
	 * @ResponseBody public Optional<State> findById(Integer id) { return
	 * stateService.findById(id); }
	 * 
	 * //Add State
	 * 
	 * @PostMapping(value="states/addNew") public String addNew(State state) {
	 * stateService.save(state); return "redirect:/states"; }
	 * 
	 * @RequestMapping(value="states/update", method = {RequestMethod.PUT,
	 * RequestMethod.GET}) public String update(State state) {
	 * stateService.save(state); return "redirect:/states"; }
	 * 
	 * @RequestMapping(value="states/delete", method = {RequestMethod.DELETE,
	 * RequestMethod.GET}) public String delete(Integer id) {
	 * stateService.delete(id); return "redirect:/states"; }
	 */
}
