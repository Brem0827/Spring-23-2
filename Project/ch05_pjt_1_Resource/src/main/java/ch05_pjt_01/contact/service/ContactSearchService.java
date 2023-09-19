package ch05_pjt_01.contact.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactSearchService {

	//@Autowired
	@Resource
    private ContactDao contactDao;
    
    //public ContactSearchService() {
    //  System.out.println("ContactSearchService의 기본생성자");
    //}
    
    //@Autowired
	//public ContactSearchService(ContactDao contactDao) {
    //	System.out.println("contactDao: " + contactDao); 	// contactDao 출력
	//   this.contactDao = contactDao;
	//}

    public ContactSearchService(ContactDao contactDao) {

	System.out.println("ContactSearchService의 contactDao 호출"); 	// contactDao 출력
        this.contactDao = contactDao;
    }

    public ContactSet searchContact(String name) {
        if (verify(name)) {
            return contactDao.select(name);
        } else {
            System.out.println("Contact information is available.");
        }

        return null;
    }

    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name);
        return contactSet != null ? true : false;
    }

    @Resource
    public void setContactDao(ContactDao contactDao) {
    	System.out.println("ContactSearchService의 contactDao 메서드 호출"); 
        this.contactDao = contactDao;
    }

}
