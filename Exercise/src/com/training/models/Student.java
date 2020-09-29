package com.training.models;

public class Student {

	private int studentId;
	private String studentName;
	private String branch;
	private String year;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String branch, String year) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.branch = branch;
		this.year = year;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", branch=" + branch + ", year="
				+ year + "]";
	}

	

	
	
	
	
}

