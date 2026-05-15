package main;

import java.util.Scanner;

import Service.StudentService;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.err.println("!!----Student DataBase----!!");
		System.out.println("Please Select the option");
		System.out.println("1. To Print Deatail of Student by Name ");
		System.out.println("2. To Print All Details of the student ");

		int val = sc.nextInt();

		System.out.println("Selected option is  : " + val);

		
		StudentService s = new StudentService();
		
		switch (val) {
		case 1: {
       
	while (true ) {
	
	
			System.out.println("Enter the name of student");
			
			String name = sc.next();
			s.getAllStudentDetails(name);
	}
	
		}
		case 2: {

			s.AllStudentDetails(null);

			break;
		}

		default:
			System.err.println("Unexpected value: " + val);
		}
		

	}

}
