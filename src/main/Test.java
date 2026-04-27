package main;

import java.util.Scanner;

import Entity.Student;
import helper.outputHelper;
import repository.StudentRepository;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of student");
		String name = sc.next();

		StudentRepository repository = new StudentRepository();

		outputHelper helper = new outputHelper();

		switch (name) {
		case "Ram": {
			Student ram = repository.Ramobject();
			helper.studentdetails(ram);
			break;
		}
		case "Sham": {
			Student Sham = repository.Shamobject();
			helper.studentdetails(Sham);
			;
			break;
		}

		case "Om": {
			Student om = repository.omobject();
			helper.studentdetails(om);
			break;
		}
		case "Piyush": {
			Student Piyush = repository.piyusobject();
			helper.studentdetails(Piyush);
			break;
		}

		case "Hemant": {
			Student Hemant = repository.hemantObject();
			helper.studentdetails(Hemant);
			break;

		}
		case "Makrand": {
			Student Makrand = repository.Makrandobject();
			helper.studentdetails(Makrand);
			break;
		}
		case "Kshitij": {
			Student Kshitij = repository.Kshitijobject();
			helper.studentdetails(Kshitij);
			break;

		}

		case "Aditya": {
			Student Aditya = repository.AdityaObject();
			helper.studentdetails(Aditya);
			break;

		}
		case "Ankit": {
			Student Ankit = repository.AnkitObject();
			helper.studentdetails(Ankit);
			break;
		}
		case "Abhay": {
			Student Abhay = repository.Abhay();
			helper.studentdetails(Abhay);
			break;
		}
		default:
			System.out.println("Enter proper name of student");
		}
	}

}
