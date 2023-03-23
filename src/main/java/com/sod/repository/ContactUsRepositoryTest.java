package com.sod.repository;

import org.junit.jupiter.api.Test;

import com.sod.entity.ContactUs;
import com.sod.service.ContactUsService;

import static org.junit.jupiter.api.Assertions.*;

class ContactUsRepositoryTest {

    ContactUsService contactUsService = new ContactUsService();

    @Test
    void createContact() {

        contactUsService.createContact("Johnny", "j.sky@mail.com", "2881929", "Hello Word!");
        contactUsService.createContact("Boyke", "boyke.jr@mail.com", "82791", "Message received!");

        assertEquals(contactUsService.getContactUs().size(), 3);
    }
}