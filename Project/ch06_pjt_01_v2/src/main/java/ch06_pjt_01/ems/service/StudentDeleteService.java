package ch06_pjt_01.ems.service;

import ch06_pjt_01.ems.dao.StudentDao;
import ch06_pjt_01.ems.member.Student;

public class StudentDeleteService {

	private StudentDao studentDao;

	public StudentDeleteService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void delete(String sNum) {
		if (verify(sNum)) {
			studentDao.delete(sNum);
		} else {
			System.out.println("Student information is available.");
		}
	}

	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}

}