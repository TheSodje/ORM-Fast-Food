package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.ContactUs;
import com.sod.repository.ContactUsRepository;

public class ContactUsService {

    private final ContactUsRepository contactUsRepository;

    public ContactUsService() {
        this.contactUsRepository = new ContactUsRepository(JPAConfiguration.getEntityManager());
    }

    public ContactUs createContactUs(ContactUs contactUs) {
        return contactUsRepository.createContactUs(contactUs);
    }

    public ContactUs createContact(String name, String email, String number, String message) {
        return contactUsRepository.createContact(name, email, number, message);
    }

    public List<ContactUs> getContactUs() {
        return contactUsRepository.getContactUs();
    }

}