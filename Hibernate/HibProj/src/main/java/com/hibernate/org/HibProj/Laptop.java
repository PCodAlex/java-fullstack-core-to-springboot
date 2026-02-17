package com.hibernate.org.HibProj;

//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;


@Entity
public class Laptop {
	
	@Id
	private int LapId;
	private String brand;
	private int modelNo;
	private String os;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getLapId() {
		return LapId;
	}
	public void setLapId(int lapId) {
		LapId = lapId;
	}
	@Override
	public String toString() {
		return "Laptop [LapId=" + LapId + ", brand=" + brand + ", modelNo=" + modelNo + ", os=" + os + ", ]";
	}
}
