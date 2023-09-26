package ch04_pjt_03.ems.service;

import ch04_pjt_03.ems.dao.StudentDao;
import ch04_pjt_03.ems.member.Student;

public class StudentSelectService {

	private StudentDao studentDao;

	public StudentSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Student select(String sId) {
		if (verify(sId)) {
			return studentDao.select(sId);

		} else {
			System.out.println("Student information is available.");
		}

		return null;
	}

	public boolean verify(String sId) {
		Student student = studentDao.select(sId);
		return student != null ? true : false;
	}

}