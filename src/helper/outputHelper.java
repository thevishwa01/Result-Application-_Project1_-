package helper;

import Entity.Student;

public class outputHelper {
	
	public static void studentdetails(Student s) {
		
		System.out.println("id : "+s.id);
		System.out.println("First name : "+s.fname);
		System.out.println("Last name : "+s.lname);
		System.out.println("English marks : "+s.Englishobt);
		System.out.println("Maths marks : "+s.Mathsobt);
		System.out.println("Science marks : "+s.Scienceobt);
		System.out.println("================================");
		
		
	}

}
