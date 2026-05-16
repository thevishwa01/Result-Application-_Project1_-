package repository;

import Entity.Student;

public class StudentRepository {

	public static Student[] getAllStudent1() {

		Student s1 = new Student();
//		s1.id = 101;
//		s1.fname = "Ram";
//		s1.lname = "patil";
//		s1.Englishobt = 75;
//		s1.Mathsobt = 85;
//		s1.Scienceobt = 83;
		
		
		s1.setId(101);
		s1.setFname("Ram");
        s1.setLname("Patil");
        s1.setEnglishobt(75);
        s1.setMathsobt(85);
        s1.setMathsobt(83);
        
        
        
        
		Student s2 = new Student();
		s2.setId(102);
		s2.setFname("Sham");
		s2.setLname("Patil");
		s2.setMathsobt(75);
		s2.setEnglishobt(74);
		s2.setScienceobt(88);

		Student s3 = new Student();
		s3.setId(103);
		s3.setFname("OM");
		s3.setLname("Kamble");
		s3.setEnglishobt(85);
		s3.setMathsobt(83);
		s3.setScienceobt(75);

		Student s4 = new Student();
		s4.setId(104);
		s4.setFname("Piyush");
		s4.setLname("Nande");
		s4.setEnglishobt(98);
		s4.setMathsobt(89);
		s4.setScienceobt(97);

		Student s5 = new Student();
		s5.setId(105);
		s5.setFname("Hemant");
		s5.setLname("Humne");
		s5.setEnglishobt(75);
		s5.setMathsobt(67);
		s5.setScienceobt(98);

		Student s6 = new Student();
		s6.setId(106);
		s6.setFname("Makrand");
		s6.setLname("Patil");
		s6.setEnglishobt(78);
		s6.setMathsobt(83);
		s6.setScienceobt(89);

		Student s7 = new Student();
		s7.setId(107);
		s7.setFname("Kshitij");
		s7.setLname("Ghumnar");
		s7.setEnglishobt(73);
		s7.setMathsobt(99);
		s7.setScienceobt(84);

		Student s8 = new Student();
		s8.setId(109);
		s8.setFname("Ankit");
		s8.setLname("Rathod");
		s8.setEnglishobt(85);
		s8.setMathsobt(78);
		s8.setScienceobt(85);

		Student s9 = new Student();
		s9.setId(108);
		s9.setFname("Aditya");
		s9.setLname("Ade");
		s9.setEnglishobt(97);
		s9.setMathsobt(75);
		s9.setScienceobt(85);

		Student s10 = new Student();
		s10.setId(110);
		s10.setFname("Abhay");
		s10.setLname("Gulhane");
		s10.setEnglishobt(74);
		s10.setMathsobt(85);
		s10.setScienceobt(87);

		Student[] StudentArray = { s1, s2, s3, s4, s5, s6, s7, s8, s9,s10 };

		return StudentArray;

	}

}
