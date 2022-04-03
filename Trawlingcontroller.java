package com.pro1.pro1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro1.pro1.dto.*;


import com.pro1.pro1.service.Trawlingservice;



@RestController
public  class Trawlingcontroller {
	
	@Autowired
	Trawlingservice trawlingserice;
	
	
	
	
	@PostMapping(value = "/trawlingDetails", consumes = "application/json" )
	public List<com.pro1.pro1.model.TrawlingDetails> saveTrawlingDetails(@RequestBody com.pro1.pro1.dto.TrawlingDetailRequest trawlingDetailReuest) {
		return trawlingserice.saveTrawlingDetails(trawlingDetailReuest);
	}
	
	
	@GetMapping("/trawlingDetails/{trawlingNumber}")
	public List<com.pro1.pro1.model.TrawlingDetails> getDetailsByID(@PathVariable String trawlingNumber){
		return trawlingserice.getDetailsByID(trawlingNumber);
	}
	
	

	
}
