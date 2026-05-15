package repository;

import Entity.Student;

public class StudentRepository {

	public static Student[] getAllStudent1() {

		Student s1 = new Student();
		s1.id = 101;
		s1.fname = "Ram";
		s1.lname = "patil";
		s1.Englishobt = 75;
		s1.Mathsobt = 85;
		s1.Scienceobt = 83;

		Student s2 = new Student();
		s2.id = 102;
		s2.fname = "Sham";
		s2.lname = "Patil";
		s2.Mathsobt = 75;
		s2.Englishobt = 74;
		s2.Scienceobt = 88;

		Student s3 = new Student();
		s3.id = 103;
		s3.fname = "OM";
		s3.lname = "Kamble";
		s3.Englishobt = 85;
		s3.Mathsobt = 83;
		s3.Scienceobt = 75;

		Student s4 = new Student();
		s4.id = 104;
		s4.fname = "Piyush";
		s4.lname = "Nande";
		s4.Englishobt = 98;
		s4.Mathsobt = 89;
		s4.Scienceobt = 97;

		Student s5 = new Student();
		s5.id = 105;
		s5.fname = "Hemant";
		s5.lname = "Humne";
		s5.Englishobt = 75;
		s5.Mathsobt = 67;
		s5.Scienceobt = 98;

		Student s6 = new Student();
		s6.id = 106;
		s6.fname = "Makrand";
		s6.lname = "Patil";
		s6.Englishobt = 78;
		s6.Mathsobt = 83;
		s6.Scienceobt = 89;

		Student s7 = new Student();
		s7.id = 107;
		s7.fname = "Kshitij";
		s7.lname = "Ghumnar";
		s7.Englishobt = 73;
		s7.Mathsobt = 99;
		s7.Scienceobt = 84;

		Student s8 = new Student();
		s8.id = 109;
		s8.fname = "Ankit";
		s8.lname = "Rathod";
		s8.Englishobt = 85;
		s8.Mathsobt = 78;
		s8.Scienceobt = 85;

		Student s9 = new Student();
		s9.id = 108;
		s9.fname = "Aditya";
		s9.lname = "Ade";
		s9.Englishobt = 97;
		s9.Mathsobt = 75;
		s9.Scienceobt = 85;

		Student s10 = new Student();
		s10.id = 110;
		s10.fname = "Abhay";
		s10.lname = "Gulhane";
		s10.Englishobt = 74;
		s10.Mathsobt = 85;
		s10.Scienceobt = 87;

		Student[] StudentArray = { s1, s2, s3, s4, s5, s6, s7, s8, s9,s10 };

		return StudentArray;

	}

}
