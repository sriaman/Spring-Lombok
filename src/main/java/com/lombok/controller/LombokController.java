package com.lombok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lombok.entity.InsuranceDTO;
import com.lombok.service.InsuranceService;

@RestController
@RequestMapping("/insurance")
public class LombokController{

	@Autowired
	InsuranceService insuranceService;
	
	@GetMapping("/")
	public InsuranceDTO getDetails(@RequestParam String user) {
		InsuranceDTO insu2 =  insuranceService.getInsuranceDetails(user);
		return insu2;
		
	}
}
