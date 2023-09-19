package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactSearchService {

    @Autowired
    @Qualifier("qualifierDao")
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

//    @Autowired
    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

}
