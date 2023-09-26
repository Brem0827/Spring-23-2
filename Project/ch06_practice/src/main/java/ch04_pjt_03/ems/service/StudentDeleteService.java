package ch04_pjt_03.ems.service;

import ch04_pjt_03.ems.dao.StudentDao;
import ch04_pjt_03.ems.member.Student;

public class StudentDeleteService {

	private StudentDao studentDao;

	public StudentDeleteService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void delete(String sId) {
		if (verify(sId)) {
			studentDao.delete(sId);
		} else {
			System.out.println("Student information is available.");
		}
	}

	public boolean verify(String sId) {
		Student student = studentDao.select(sId);
		return student != null ? true : false;
	}

}