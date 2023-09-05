package ch04_pjt_01.ems.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.dao.StudentDao;

public class StudentModifyService {

	private StudentDao studentDao;

	public StudentModifyService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void modify(Student student) {
		if (verify(student.getsNum())) {
			studentDao.update(student);
		} else {
			System.out.println("Student information is available.");
		}
	}

	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}

}