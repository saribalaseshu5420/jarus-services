package com.jarus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarus.model.Insurence;
import com.jarus.service.InsurenceService;

@RestController
@RequestMapping(value = "/insurence")
public class InsurenceController {

	@Autowired
	InsurenceService insurenceService;

	@PostMapping
	public Insurence save(@RequestBody Insurence insurence) {
		return insurenceService.save (insurence);
	}

	@GetMapping
	public List<Insurence> getInsurences(){
		return insurenceService.getInsurences();
	}

	@GetMapping
	public Insurence getInsurence(String name) throws Exception{ 
			return insurenceService.getInsurence (name);
	}
}
