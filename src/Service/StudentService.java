package Service;

import Entity.Student;
import helper.outputHelper;
import repository.StudentRepository;

public class StudentService {

	public void getAllStudentDetails(String name) {
		Student[] st = StudentRepository.getAllStudent1();
		for (int i = 0; i < st.length; i++) {
			Student student = st[i];

			if (student.fname.equalsIgnoreCase(name)) {
				outputHelper.studentdetails(student);

			}
		}

	}

	public void AllStudentDetails(String name) {

		Student[] st = StudentRepository.getAllStudent1();
		for (int i = 0; i < st.length; i++) {
			Student student = st[i];
			outputHelper.studentdetails(student);

		}

	}
}
