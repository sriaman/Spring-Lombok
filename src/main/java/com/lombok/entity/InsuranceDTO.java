package com.lombok.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class InsuranceDTO {

	private long id;
	private String name;
	private int sumAssured;
	private String city;
}
