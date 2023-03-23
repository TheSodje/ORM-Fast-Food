package com.sod.repository;

import java.util.List;

import com.sod.entity.ContactUs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class ContactUsRepository {

    private final EntityManager entityManager;

    public ContactUsRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public ContactUs createContactUs(ContactUs contactUs) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(contactUs);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return contactUs;
    }

    
    public ContactUs createContact(String name, String email, String number, String message) {
        ContactUs contactUs = new ContactUs();
        contactUs.setName(name);
        contactUs.setEmail(email);
        contactUs.setNumber(number);
        contactUs.setMessage(message);
        return createContactUs(contactUs);
    }

    public List<ContactUs> getContactUs() {
        String query = "select c from ContactUs c";
        TypedQuery<ContactUs> typedQuery = entityManager.createQuery(query, ContactUs.class);
        List<ContactUs> contactList = typedQuery.getResultList();
        return contactList;
    }

}