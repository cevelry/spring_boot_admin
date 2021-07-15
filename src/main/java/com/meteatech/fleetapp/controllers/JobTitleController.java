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

import com.meteatech.fleetapp.models.JobTitle;
import com.meteatech.fleetapp.services.JobTitleService;

@Controller
public class JobTitleController {

	
	
	@Autowired
	private JobTitleService jobTitleService;

	@GetMapping("/jobTitles")
	public String getStates(Model model) {

		
		List<JobTitle> jobTitleList=jobTitleService.findAll();
		model.addAttribute("jobTitles", jobTitleList);

		return "jobTitle";
	}

	@PostMapping("/jobTitles/addNew")
	public String addNew(JobTitle jobTitle) {
		jobTitleService.save(jobTitle);
		return "redirect:/jobTitles";
	}

	@RequestMapping("jobTitles/findById")
	@ResponseBody
	public Optional<JobTitle> findById(int id) {
		return jobTitleService.findById(id);

	}

	@RequestMapping(value = "/jobTitles/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(JobTitle jobTitle) {
		jobTitleService.save(jobTitle);
		return "redirect:/jobTitles";
	}

	@RequestMapping(value = "/jobTitles/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		jobTitleService.delete(id);
		return "redirect:/jobTitles";
	}
	
}
