package ch05_pjt_01.contact.service;

import javax.inject.Inject;
import javax.inject.Named;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactSearchService {

    @Inject
    @Named("contactDao1")
    private ContactDao contactDao;

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

    public void setContactDao(ContactDao contactDao) {
    	System.out.println("ContactSearchService의 contactDao 메서드 호출"); 
        this.contactDao = contactDao;
    }

}
