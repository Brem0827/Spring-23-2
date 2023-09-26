package ch04_pjt_01.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch04_pjt_03.ems.dao.StudentDao;
import ch04_pjt_03.ems.member.DBConnectionInfo;
import ch04_pjt_03.ems.service.EMSInformationService;
import ch04_pjt_03.ems.service.StudentRegisterService;
import ch04_pjt_03.ems.utils.InitSampleData;

@Configuration
public class applicationContext {
	@Bean
    public InitSampleData initSampleData() {
        InitSampleData initSampleData = new InitSampleData();
        // Set properties here
        return initSampleData;
    }

    @Bean
    public StudentDao studentDao() {
        return new StudentDao();
    }

    @Bean
    public StudentRegisterService studentRegisterService(StudentDao studentDao) {
        return new StudentRegisterService(studentDao);
    }

    // Define other beans similarly

    @Bean(name = "dev_DBConnectionInfoDev")
    public DBConnectionInfo devDBConnectionInfo() {
        DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
        dbConnectionInfo.setUrl("000.000.000.000");
        dbConnectionInfo.setUserId("admin");
        dbConnectionInfo.setUserPw("0000");
        return dbConnectionInfo;
    }

    @Bean(name = "real_DBConnectionInfo")
    public DBConnectionInfo realDBConnectionInfo() {
        DBConnectionInfo dbConnectionInfo = new DBConnectionInfo();
        dbConnectionInfo.setUrl("111.111.111.111");
        dbConnectionInfo.setUserId("master");
        dbConnectionInfo.setUserPw("1111");
        return dbConnectionInfo;
    }

    @Bean
    public EMSInformationService emsInformationService() {
        EMSInformationService emsInformationService = new EMSInformationService();
        // Set properties here
        return emsInformationService;
    }
}
