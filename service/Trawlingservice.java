package com.pro1.pro1.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.pro1.pro1.controller.*;
import com.pro1.pro1.dto.FishDetail;
import com.pro1.pro1.dto.TrawlingDetailRequest;
import com.pro1.pro1.model.*;
import com.pro1.pro1.repository.TrawlingRepository;


@Service
public class Trawlingservice {
	
	@Autowired
	TrawlingRepository trawlingrepository;
	

	
	@Autowired
	JdbcTemplate jdbc;
	
	public List<TrawlingDetails> saveTrawlingDetails(@RequestBody TrawlingDetailRequest trawlingDetailRequest) {
		
		List<TrawlingDetails> trawlingDetails =new ArrayList<TrawlingDetails>();
		
		for(FishDetail fishDetail : trawlingDetailRequest.getFishDetails()) {
			TrawlingDetails trawlingDetail = new TrawlingDetails();
			trawlingDetail.setTrawlingNumber(trawlingDetailRequest.getTrawlingNumber());
			trawlingDetail.setTrawlingDate(trawlingDetailRequest.getTrawlingDate());
			trawlingDetail.setTotalVolume(trawlingDetailRequest.getTotalVolume());
			trawlingDetail.setFishType(fishDetail.getFishType());
			trawlingDetail.setFishCategory(fishDetail.getFishCategory());
			trawlingDetail.setFishGrade(fishDetail.getFishGrade());
			trawlingDetail.setNofBoxes(fishDetail.getNoofBoxes());
			trawlingDetail.setPosition(fishDetail.getPosition());
			trawlingDetails.add(trawlingDetail);
		}
		
		if(!trawlingDetails.isEmpty()) {
			trawlingrepository.saveAll(trawlingDetails);
		}
		
		return trawlingDetails;		

		
	}
	

	public List<TrawlingDetails> getDetailsByID(String trawlingNumber){
		String sql = "select * from TrawlingDetails where trawlingNumber = '"+ trawlingNumber +"'";
		List<TrawlingDetails> list = jdbc.query(sql, new BeanPropertyRowMapper<TrawlingDetails>(TrawlingDetails.class), trawlingNumber);
		return list;
		
		
	}
	
	
	
	

	
	class TrawlingDetailRowMapper implements RowMapper<TrawlingDetails>{

		@Override
		public TrawlingDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			TrawlingDetails td =new TrawlingDetails();
			td.setTrawlingNumber(rs.getString("trawlingNumber"));
			
			
			// TODO Auto-generated method stub
			return null;
		}
		
	}}



