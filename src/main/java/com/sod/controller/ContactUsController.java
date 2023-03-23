package com.sod.controller;

import com.sod.dto.ContactDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import com.sod.entity.ContactUs;
import com.sod.service.ContactUsService;
import java.util.List;

@Path("/contact")
public class ContactUsController {

    private final ContactUsService contactUsService = new ContactUsService();

    @Path("/getContacts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ContactUs> allContact() {
        return contactUsService.getContactUs();
    }

    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ContactUs createContactUs(ContactDTO contactDTO) {
        return contactUsService.createContact(contactDTO.getName(), contactDTO.getEmail(), contactDTO.getNumber(), contactDTO.getMessage());
    }

}
