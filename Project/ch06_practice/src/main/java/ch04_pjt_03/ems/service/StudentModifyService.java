package ch04_pjt_03.ems.service;

import ch04_pjt_03.ems.dao.StudentDao;
import ch04_pjt_03.ems.member.Student;

public class StudentModifyService {

	private StudentDao studentDao;

	public StudentModifyService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void modify(Student student) {
		if (verify(student.getsId())) {
			studentDao.update(student);
		} else {
			System.out.println("Student information is available.");
		}
	}

	public boolean verify(String sId) {
		Student student = studentDao.select(sId);
		return student != null ? true : false;
	}

}