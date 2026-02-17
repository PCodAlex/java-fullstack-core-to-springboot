//package com.hibernate.org.HibProj;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
//
//@Entity(name="techrTbl")
//@Table(name="teacher_data_table")
//public class Teacher {
//	
//	@Id
//	private int teacherId;
//	@Column(name="t_name")
//	private String teacherNameString;
//	@Transient
//	private int teacherSal;
//	
//	public int getTeacherId() {
//		return teacherId;
//	}
//	
//	public void setTeacherId(int teacherId) {
//		this.teacherId = teacherId;
//	}
//	
//	public String getTeacherNameString() {
//		return teacherNameString;
//	}
//	
//	public void setTeacherNameString(String teacherNameString) {
//		this.teacherNameString = teacherNameString;
//	}
//	
//	public int getTeacherSal() {
//		return teacherSal;
//	}
//	
//	public void setTeacherSal(int teacherSal) {
//		this.teacherSal = teacherSal;
//	}
//	
//	@Override
//	public String toString() {
//		return "Teacher [teacherId=" + teacherId + ", teacherNameString=" + teacherNameString + ", teacherSal="
//				+ teacherSal + "]";
//	}
//}
