package com.project;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	
	private List<Student> studentList=new ArrayList<>();
	
	
	public void addStudent(Student student) {
		studentList.add(student);
		System.out.println("student added successfully");
	}
	
	
	public Student searchStudent(int rollNumber) {
		for(Student s : studentList) {
			if(s.getRollNumber()==rollNumber) {
				return s;
			}
		}
		return null;
	}
	
	
	public boolean updateStudent(int rollNumber,String newCourse,double newGrade) {
		Student s=searchStudent(rollNumber);
		if(s !=null) {
			s.setCourse(newCourse);
			s.setGrade(newGrade);
			return true;
		}
		return false;
	}
	
	public boolean deleteStudent(int rollNumber) {
		Student s = searchStudent(rollNumber);
		if(s != null) {
			studentList.remove(s);
			return true;
		}
		
		return false;
	}
	
	
	public void listAllStudents() {
		if(studentList.isEmpty()) {
			System.out.println("No students found!");
		}
		else {
			for(Student s : studentList) {
				System.out.println(s);
			}
		}
	}

}
