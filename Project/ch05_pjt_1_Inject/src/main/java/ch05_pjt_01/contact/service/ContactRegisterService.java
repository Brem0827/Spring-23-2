package ch05_pjt_01.contact.service;

import javax.inject.Inject;
import javax.inject.Named;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactRegisterService {

	// 필드 자동 주입
    @Inject
    @Named("contactDao1")
    private ContactDao contactDao;
    
    public ContactRegisterService() {
    	System.out.println("기본 생성자");
    }
    
    public void register(ContactSet contactSet) {
        String name = contactSet.getName();
        if (verify(name)) {
            contactDao.insert(contactSet);
        } else {
            System.out.println("The name has already registered.");
        }
    }

    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name);
        return contactSet == null ? true : false;
    }

    public void contactDao(ContactDao contactDao) {
    	System.out.println("ContactRegisterService의 contactDao 메서드 호출"); 
        this.contactDao = contactDao;
    }

}
