package ch05_pjt_01.contact.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch05_pjt_01.contact.ContactSet;
import spring5.MemberSet;

public class ContactDao {

	private final Map<String, ContactSet> contactDB = new HashMap<>();

    private final List<ContactSet> contactList = new ArrayList<>();

    public void insert(ContactSet contactSet) {
    	contactList.add(contactSet);
    }

    public ContactSet select(String name) {
        return contactDB.get(name);
    }

    public Map<String, ContactSet> getContactDB() {
        return contactDB;
    }

    public List<ContactSet> getContactList() {
        return contactList;
    }
}
