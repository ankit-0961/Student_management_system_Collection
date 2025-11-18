package com.project;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		
		StudentManager studentManager = new StudentManager();
		Scanner scanner = new Scanner(System.in);
		
		boolean exist =false;
		
		while(!exist) {
			System.out.println("\n*************student Management system**************");
			System.out.println("1. Add new student");
			System.out.println("2. Search student by roll number");
			System.out.println("3. update courses and grades");
			System.out.println("4. Delete a student");
			System.out.println("5. List all students");
			System.out.println("6. Exist");
			
			System.out.print("Enter your choice :" );
			int choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter roll Number:");
				int roll=scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Enter name:");
				String name = scanner.nextLine();
				
				System.out.println("Enter course:");
				String course = scanner.nextLine();
				
				System.out.println("Enter grade:");
				double grade = scanner.nextDouble();
				    
				Student newStudent = new Student (roll,name,course,grade);
				studentManager.addStudent(newStudent);
				break;
				
			case 2:
				System.out.println("Enter roll number to search :");
				int searchRoll = scanner.nextInt();
				Student found = studentManager.searchStudent(searchRoll);
				
				if(found != null) {
					System.out.println("student found :" + found);
					
				}else {
					System.out.println("student not found!");
					
				}
				break;
				
			case 3:
				System.out.println("Enter roll number to update :");
				int updateRoll=scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Enter new course :");
				String newCourse = scanner.nextLine();
				
				System.out.println("Enter new grade :");
				double newGrade = scanner.nextDouble();
				
				if(studentManager.updateStudent(updateRoll, newCourse, newGrade)) {
					System.out.println("Student updated successfully !");
					
				}
				else {
					System.out.println("update failed ! stuudent not found.");
				}
				break;
				
			case 4:
				System.out.println("Enter roll number to delete :");
				int deleteRoll=scanner.nextInt();
				
				if (studentManager.deleteStudent(deleteRoll)) {
					
				}else {
					System.out.println("Delete failed ! student not found.");
					
					
				}
				break;
				
			case 5:
				studentManager.listAllStudents();
				break;
				
			case 6:
				exist=true;
				System.out.println("Existing program..");
				break;
				
			default:
				System.out.println("Invalid choice ! please choose again.");
			}
		}
		
		scanner.close();

	}

}
