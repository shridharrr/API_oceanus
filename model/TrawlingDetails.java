package com.pro1.pro1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrawlingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate trawlingDate;
	private Double totalVolume;
	private String fishType;
	private String fishCategory;
	private String fishGrade;
	private int nofBoxes;
	private String position;
	public String getTrawlingNumber() {
		return trawlingNumber;
	}

	
	private String trawlingNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFishType() {
		return fishType;
	}
	public void setFishType(String fishType) {
		this.fishType = fishType;
	}
	public String getFishCategory() {
		return fishCategory;
	}
	public void setFishCategory(String fishCategory) {
		this.fishCategory = fishCategory;
	}
	public String getFishGrade() {
		return fishGrade;
	}
	public void setFishGrade(String fishGrade) {
		this.fishGrade = fishGrade;
	}
	public int getNofBoxes() {
		return nofBoxes;
	}
	public void setNofBoxes(int nofBoxes) {
		this.nofBoxes = nofBoxes;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setTrawlingNumber(String trawlingNumber) {
		this.trawlingNumber = trawlingNumber;
	}
	
}
