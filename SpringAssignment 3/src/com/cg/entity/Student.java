package com.cg.entity;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

public class Student {

	@Size(min = 3, max = 15, message = "Student name must contain  min 3 and max 15 char")
	@NotEmpty(message = "Student name must manadatory")
	@Pattern(regexp = "[a-zA-Z]+",message = "Student name must contain Alphabets")
	private String stuName;
	
	@Min(value = 0)
	@Max(value = 100)
	@NotNull(message = "Marks are manadatory")
	private Integer javaMarks;
	
	@Min(value = 0)
	@Max(value = 100)
	@NotNull(message = "Marks are manadatory")
	private Integer angMarks;
	
	@Min(value = 0)
	@Max(value = 100)
	@NotNull(message = "Marks are manadatory")
	private Integer springMarks;
	
	@NotNull(message = "Date must required")
	@DateTimeFormat(pattern = "yyyy-M-d")
	@Past(message = "date must be past date")
	private LocalDate doj;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getJavaMarks() {
		return javaMarks;
	}

	public void setJavaMarks(Integer javaMarks) {
		this.javaMarks = javaMarks;
	}

	public Integer getAngMarks() {
		return angMarks;
	}

	public void setAngMarks(Integer angMarks) {
		this.angMarks = angMarks;
	}

	public Integer getSpringMarks() {
		return springMarks;
	}

	public void setSpringMarks(Integer springMarks) {
		this.springMarks = springMarks;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
	
}
