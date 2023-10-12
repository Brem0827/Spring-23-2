package ch06_pjt_01.ems.service;

import java.util.Map;

import ch06_pjt_01.ems.dao.StudentDao;
import ch06_pjt_01.ems.member.Student;

public class StudentAllSelectService {

	private StudentDao studentDao;

	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}

}