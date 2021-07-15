package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.JobTitle;
import com.meteatech.fleetapp.models.Location;
import com.meteatech.fleetapp.repository.JobTitleRepository;

@Service
public class JobTitleService {

	@Autowired
	private JobTitleRepository jobTitleRepository;
	
	
	//get jobTitles /jobTitles
	public List<JobTitle> findAll() {
		return (List<JobTitle>) jobTitleRepository.findAll();
	}
	
	//post new jobTitle
	public void save(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}
	
	//get by id
	public Optional<JobTitle> findById(int id) {
		return jobTitleRepository.findById(id);
	}
	
	//delete by id
		public void delete(int id) {
			 jobTitleRepository.deleteById(id);
		}
}
