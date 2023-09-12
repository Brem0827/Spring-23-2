package ch04_pjt_03.ems.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_03.ems.member.Student;

public class PrintStudentInformationService {

	StudentAllSelectService allSelectService;

	public PrintStudentInformationService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}

	public void printStudentsInfo() {
		Map<String, Student> allStudent = allSelectService.allSelect();
		Set<String> keys = allStudent.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("한빛 구민센터 회원 관리 시스템 -------------");
		while (iterator.hasNext()) {
			String key = iterator.next();
			Student student = allStudent.get(key);
			System.out.print("아이디:" + student.getsId() + "\t");
			System.out.print("|비밀번호:" + student.getsPw() + "\t");
			System.out.print("|전화번호:" + student.getsPhone() + "\t");
			System.out.print("|이메일:" + student.getsMail() + "\t");
			System.out.print("|신규 회원 가입일:" + student.getsDate() + "\t");
			System.out.print("|마지막 회원 정보 수정일:" + student.getsLastUpdateDate() + "\t");

		}
		System.out.println("END ----------------------------");
	}

}