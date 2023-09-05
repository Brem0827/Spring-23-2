package ch04_pjt_01.ems.service;

import java.util.Map;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.dao.StudentDao;

public class StudentAllSelectService {

	private StudentDao studentDao;

	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}

}