package helper;

import Entity.Student;

public class outputHelper {
	
	public static void studentdetails(Student s) {
		
		System.out.println("id : "+s.getId());
		System.out.println("First name : "+s.getFname());
		System.out.println("Last name : "+s.getLname());
		System.out.println("English marks : "+s.getEnglishobt());
		System.out.println("Maths marks : "+s.getMathsobt());
		System.out.println("Science marks : "+s.getScienceobt());
		System.out.println("================================");
		
		
	}

}
