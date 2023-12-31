package ch05_pjt_01.contact;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;

import ch05_pjt_01.contact.service.ContactRegisterService;
import ch05_pjt_01.contact.utils.InitSampleData;

@Controller
public class MainClass {
	public static void main(String[] args) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:appCtx.xml");

        InitSampleData initSampleData =
                ctx.getBean("initSampleData", InitSampleData.class);

        String[] ids = initSampleData.getIds();
        String[] pws = initSampleData.getPws();
        String[] names = initSampleData.getNames();
        String[] num1s = initSampleData.getNum1s();
        String[] num2s = initSampleData.getNum2s();
        String[] emails = initSampleData.getEmails();
        String[] phones = initSampleData.getPhones();
        String[] addresses = initSampleData.getAddresses();
        String[] jobs = initSampleData.getJobs();

        ContactRegisterService registerService = 
                ctx.getBean("registerService", ContactRegisterService.class);
        for (int i = 0; i < ids.length; i++) {
        	ContactSet contactSet = new ContactSet(ids[i], pws[i], names[i], num1s[i], num2s[i], emails[i], phones[i], addresses[i], jobs[i]);
        	registerService.register(contactSet);
        }

        ctx.close();
    }
}
