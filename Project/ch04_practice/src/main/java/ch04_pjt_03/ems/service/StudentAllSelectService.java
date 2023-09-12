package ch04_pjt_03.ems.service;

import java.util.Map;

import ch04_pjt_03.ems.dao.StudentDao;
import ch04_pjt_03.ems.member.Student;

public class StudentAllSelectService {

	private StudentDao studentDao;

	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}

}