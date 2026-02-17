package com.hibernate.org.HibProj;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String sName;
	private int sAge;
	@OneToMany(fetch=FetchType.EAGER)
	private List<Laptop> laps;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public List<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(List<Laptop> laps) {
		this.laps = laps;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + ", sAge=" + sAge + ", laps=" + laps + "]";
	}
}
