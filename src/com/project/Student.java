package com.project;

public class Student {

	private int rollNumber;
	private String name;
	private String course;
	private double grade;
	
	public Student(int rollNumber,String name, String course,double grade) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.course =course;
		this.grade=grade;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}
	
	
	
	
}
