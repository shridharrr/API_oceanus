package com.pro1.pro1.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TrawlingDetailRequest {
	
	private String trawlingNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate trawlingDate;
	private Double totalVolume;
	private List<FishDetail> fishDetails;
	public String getTrawlingNumber() {
		return trawlingNumber;
	}
	public void setTrawlingNumber(String trawlingNumber) {
		this.trawlingNumber = trawlingNumber;
	}
	public LocalDate getTrawlingDate() {
		return trawlingDate;
	}
	public void setTrawlingDate(LocalDate trawlingDate) {
		this.trawlingDate = trawlingDate;
	}
	public Double getTotalVolume() {
		return totalVolume;
	}
	public void setTotalVolume(Double totalVolume) {
		this.totalVolume = totalVolume;
	}
	public List<FishDetail> getFishDetails() {
		return fishDetails;
	}
	public void setFishDetails(List<FishDetail> fishDetails) {
		this.fishDetails = fishDetails;
	}

}
