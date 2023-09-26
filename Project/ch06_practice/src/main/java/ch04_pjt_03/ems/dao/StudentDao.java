package ch04_pjt_03.ems.dao;

import java.util.HashMap;
import java.util.Map;

import ch04_pjt_03.ems.member.Student;

public class StudentDao {

	private Map<String, Student> studentDB = new HashMap<String, Student>();
	public void insert(Student student) {
		studentDB.put(student.getsId(), student);
	}
	public Student select(String sId) {
		return studentDB.get(sId);
	}
	public void update(Student student) {
		studentDB.put(student.getsId(), student);
	}
	public void delete(String sId) {
		studentDB.remove(sId);
	}
	public Map<String, Student> getStudentDB() {
		return studentDB;
	}
}