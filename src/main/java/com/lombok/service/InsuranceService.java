package com.lombok.service;

import org.springframework.stereotype.Component;

import com.lombok.entity.InsuranceDTO;

import lombok.NonNull;

@Component
public class InsuranceService {

	public InsuranceDTO getInsuranceDetails(@NonNull String insu) {

		InsuranceDTO dto = new InsuranceDTO();
		dto.setId(1);
		dto.setCity("Delhi");
		dto.setName(insu);
		dto.setSumAssured(1100000);
		return dto;
	}
}
