package ch04_pjt_03.ems.service;

import ch04_pjt_03.ems.dao.StudentDao;
import ch04_pjt_03.ems.member.Student;

public class StudentRegisterService {

	private StudentDao studentDao;

	public StudentRegisterService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void register(Student student) {
		if (verify(student.getsId())) {
			studentDao.insert(student);
		} else {
			System.out.println("The student has already registered.");
		}
	}

	public boolean verify(String sId) {
		Student student = studentDao.select(sId);
		return student == null ? true : false;
	}

}