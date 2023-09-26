package ch06_pjt_01.ems.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.dao.StudentDao;
import ch06_pjt_01.ems.member.DBConnectionInfo;
import ch06_pjt_01.ems.service.EMSInformationService;
import ch06_pjt_01.ems.service.PrintStudentInformationService;
import ch06_pjt_01.ems.service.StudentAllSelectService;
import ch06_pjt_01.ems.service.StudentDeleteService;
import ch06_pjt_01.ems.service.StudentModifyService;
import ch06_pjt_01.ems.service.StudentRegisterService;
import ch06_pjt_01.ems.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;

@Configuration
public class MemberConfig {

	@Bean
	public InitSampleData initSampleData() {
		
		InitSampleData initSampleData = new InitSampleData();
		
		String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"};
		initSampleData.setsNums(sNums);
		
		String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
		initSampleData.setsIds(sIds);
		
		String[] sPws = {"p0001", "p0002", "p0003", "p0004", "p0005"};
		initSampleData.setsPws(sPws);
		
		String[] sNames = {"agatha", "barbara", "chris", "doris", "elva"};
		initSampleData.setsNames(sNames);
		
		int[] sAges = {19, 22, 20, 27, 19};
		initSampleData.setsAges(sAges);
		
		char[] sGenders = {'M', 'W', 'W', 'M', 'M'};
		initSampleData.setsGenders(sGenders);
		
		String[] sMajors = {"English", "Korean", "French", "Philosophy", "History"};
		initSampleData.setsMajors(sMajors);
		
		return initSampleData;
		
	}
	
	@Bean
	public StudentDao studentDao() {
		
		return new StudentDao();
		
	}
	
	@Bean
	public StudentRegisterService studentRegisterService() {
		
		return new StudentRegisterService(studentDao());
		
	}
	
	@Bean
	public StudentModifyService studentModifyService() {
		
		return new StudentModifyService(studentDao());
		
	}
	
	@Bean
	public StudentDeleteService studentDeleteService() {
		
		return new StudentDeleteService(studentDao());
		
	}
	
	@Bean
	public StudentSelectService studentSelectService() {
		
		return new StudentSelectService(studentDao());
		
	}
	
	@Bean
	public StudentAllSelectService studentAllSelectService() {
		
		return new StudentAllSelectService(studentDao());
		
	}
	
	@Bean
	public PrintStudentInformationService printStudentInformationService() {
		
		return new PrintStudentInformationService(studentAllSelectService());
		
	}
	
	@Bean 
	public DBConnectionInfo dev_DBConnectionInfoDev() {
		
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		dbConnectionInfo.setUrl("000.000.000.000");
		dbConnectionInfo.setUserId("admin");
		dbConnectionInfo.setUserPw("0000");
		
		return dbConnectionInfo;
		
	}
	
	@Bean 
	public DBConnectionInfo real_DBConnectionInfoDev() {
		
		DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
		dbConnectionInfo.setUrl("111.111.111.111");
		dbConnectionInfo.setUserId("master");
		dbConnectionInfo.setUserPw("1111");
		
		return dbConnectionInfo;
		
	}
	
	@Bean
	public EMSInformationService eMSInformationService() {
		
		EMSInformationService emsInformationService = 
				new EMSInformationService();
		emsInformationService.setInfo("Education Management System program was developed in 2023.");
		emsInformationService.setCopyRight("COPYRIGHT(C) 2023 Daelim CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		emsInformationService.setVer("The version is 1.0");
		emsInformationService.setsYear(2023);
		emsInformationService.setsMonth(9);
		emsInformationService.setsDay(19);
		emsInformationService.seteYear(2023);
		emsInformationService.seteMonth(9);
		emsInformationService.seteDay(26);
		
		List<String> developers = new ArrayList<String>();
		developers.add("이현종");
		emsInformationService.setDevelopers(developers);
		
		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("이현종", "guswhd284@naver.com");
		emsInformationService.setAdministrators(administrators);
		
		Map<String, DBConnectionInfo> dbInfos = new HashMap<String, DBConnectionInfo>();
		dbInfos.put("dev", dev_DBConnectionInfoDev());
		dbInfos.put("real", real_DBConnectionInfoDev());
		emsInformationService.setDbInfos(dbInfos);
		
		return emsInformationService;
		
	}
	
}
