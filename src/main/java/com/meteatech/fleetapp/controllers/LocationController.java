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
import com.meteatech.fleetapp.models.Location;
import com.meteatech.fleetapp.models.State;
import com.meteatech.fleetapp.services.CountryService;
import com.meteatech.fleetapp.services.LocationService;
import com.meteatech.fleetapp.services.StateService;

@Controller
public class LocationController {
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private LocationService locationService;

	@GetMapping("/locations")
	public String getStates(Model model) {

		List<State> stateList = stateService.findAll();
		model.addAttribute("states", stateList);

		List<Country> countryList = countryService.findAll();
		model.addAttribute("countries", countryList);
		
		List<Location> locationList=locationService.findAll();
		model.addAttribute("locations", locationList);

		return "location";
	}

	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping("locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id) {
		return locationService.findById(id);

	}

	@RequestMapping(value = "/locations/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value = "/locations/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		locationService.delete(id);
		return "redirect:/locations";
	}
	

	/*
	 * @Autowired private LocationService locationService;
	 * 
	 * @Autowired private CountryService countryService;
	 * 
	 * @Autowired private StateService stateService;
	 * 
	 * @GetMapping("") public String findAll(Model model){
	 * model.addAttribute("locations", locationService.findAll());
	 * model.addAttribute("countries", countryService.findAll());
	 * model.addAttribute("states", stateService.findAll());
	 * 
	 * return "location"; }
	 * 
	 * @GetMapping("/findById")
	 * 
	 * @ResponseBody public Optional<Location> findById(Integer id) { return
	 * locationService.findById(id); }
	 * 
	 * @GetMapping("/findByDescriptionContaining/{description}") public
	 * List<Location> findByDescriptionContaining(@PathVariable("description")
	 * String description) { return
	 * locationService.findByDescriptionContaining(description); }
	 * 
	 * @PostMapping("/addNew") public String save(Location location) {
	 * locationService.save(location); return "redirect:/locations"; }
	 * 
	 * @RequestMapping(value="/update", method = {RequestMethod.PUT,
	 * RequestMethod.GET}) public String update(Location location) {
	 * locationService.save(location); return "redirect:/locations"; }
	 * 
	 * @RequestMapping(value="/delete", method = {RequestMethod.DELETE,
	 * RequestMethod.GET}) public String deleteById(Integer id) {
	 * locationService.deleteById(id); return "redirect:/locations"; }
	 */
}
