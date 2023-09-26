package ch04_pjt_03.ems;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch04_pjt_03.ems.member.Student;
import ch04_pjt_03.ems.service.EMSInformationService;
import ch04_pjt_03.ems.service.PrintStudentInformationService;
import ch04_pjt_03.ems.service.StudentDeleteService;
import ch04_pjt_03.ems.service.StudentModifyService;
import ch04_pjt_03.ems.service.StudentRegisterService;
import ch04_pjt_03.ems.service.StudentSelectService;
import ch04_pjt_03.ems.utils.InitSampleData;

public class MainClass {

	public static void main(String[] args) {
          	GenericXmlApplicationContext ctx = 
                	new GenericXmlApplicationContext("classpath:appCtxImport.xml");

		// 샘플 데이터
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		
		String[] sIds = initSampleData.getsIds();
		String[] sPws = initSampleData.getsPws();
		String[] sPhones = initSampleData.getsPhones();
		String[] sMails = initSampleData.getsMails();
		String[] sDates = initSampleData.getsDates();
		String[] sLastUpdateDates = initSampleData.getsLastUpdateDates();

		// 데이터베이스에 샘플 데이터 등록
		StudentRegisterService registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
		for (int i = 0; i < sIds.length; i++) {
			registerService
					.register(new Student(sIds[i], sPws[i], sPhones[i], sMails[i], sDates[i], sLastUpdateDates[i]));
		}
		// 학생 리스트
		PrintStudentInformationService printStudentInformatinService = ctx.getBean("printStudentInformationService",
				PrintStudentInformationService.class);
		printStudentInformatinService.printStudentsInfo(); // 학생 리스트

		// 학생 등록
		registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
		registerService.register(new Student("hbs006", "bbs006", "01000000000", "guswnd284@naver.com", "1972-11-21", "2023-09-12"));

		printStudentInformatinService.printStudentsInfo(); // 학생 리스트
		
		// 학생 출력
		StudentSelectService selectService = ctx.getBean("studentSelectService", StudentSelectService.class);
		Student selectedstudent = selectService.select("hbs006");

		System.out.println("한빛 구민센터 회원 관리 시스템 -------------");
		System.out.print("아이디:" + selectedstudent.getsId() + "\t");
		System.out.print("|비밀번호:" + selectedstudent.getsPw() + "\t");
		System.out.print("|전화번호:" + selectedstudent.getsPhone() + "\t");
		System.out.print("|이메일:" + selectedstudent.getsMail() + "\t");
		System.out.print("|신규 회원 가입일:" + selectedstudent.getsDate() + "\t");
		System.out.println("|마지막 회원 정보 수정일:" + selectedstudent.getsLastUpdateDate() + "\t");
		System.out.println("END ----------------------------");

		// 학생 수정
		StudentModifyService modifyService = ctx.getBean("studentModifyService", StudentModifyService.class);
		modifyService.modify(new Student("hbs006", "bbs006", "01000000000", "1972-11-21", "guswnd284@naver.com", "2023-09-12"));

		printStudentInformatinService.printStudentsInfo(); // 학생 리스트

		// 학생 삭제
		StudentDeleteService deleteService = ctx.getBean("studentDeleteService", StudentDeleteService.class);
		deleteService.delete("hbs005");

		printStudentInformatinService.printStudentsInfo(); // 학생 리스트

		/*
		// 시스템 정보
		EMSInformationService emsInformationService = ctx.getBean("eMSInformationService", EMSInformationService.class);
		emsInformationService.printEMSInformation();

		ctx.close();
		*/
	}
}