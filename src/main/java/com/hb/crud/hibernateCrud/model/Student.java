package com.hb.crud.hibernateCrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Integer sno;
	private String stdName; 
	private String stdClass;
	private String schoolNmae;
	
	
	
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public String getSchoolNmae() {
		return schoolNmae;
	}
	public void setSchoolNmae(String schoolNmae) {
		this.schoolNmae = schoolNmae;
	}
	public Student(Integer sno, String stdName, String stdClass, String schoolNmae) {
		super();
		this.sno = sno;
		this.stdName = stdName;
		this.stdClass = stdClass;
		this.schoolNmae = schoolNmae;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
