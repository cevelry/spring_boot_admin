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
import com.meteatech.fleetapp.models.VehicleStatus;
import com.meteatech.fleetapp.models.State;
import com.meteatech.fleetapp.services.CountryService;
import com.meteatech.fleetapp.services.VehicleStatusService;
import com.meteatech.fleetapp.services.StateService;

@Controller
public class VehicleStatusController {
	
	
	@Autowired
	private VehicleStatusService vehicleStatusService;

	@GetMapping("/vehicleStatuses")
	public String getStates(Model model) {

		
		List<VehicleStatus> vehicleStatusList=vehicleStatusService.findAll();
		model.addAttribute("vehicleStatuss", vehicleStatusList);

		return "vehicleStatus";
	}

	@PostMapping("/vehicleStatuses/addNew")
	public String addNew(VehicleStatus vehicleStatus) {
		vehicleStatusService.save(vehicleStatus);
		return "redirect:/vehicleStatuses";
	}

	@RequestMapping("vehicleStatuses/findById")
	@ResponseBody
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusService.findById(id);

	}

	@RequestMapping(value = "/vehicleStatuses/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(VehicleStatus vehicleStatus) {
		vehicleStatusService.save(vehicleStatus);
		return "redirect:/vehicleStatuses";
	}

	@RequestMapping(value = "/vehicleStatuses/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		vehicleStatusService.delete(id);
		return "redirect:/vehicleStatuses";
	}
	
	
}
