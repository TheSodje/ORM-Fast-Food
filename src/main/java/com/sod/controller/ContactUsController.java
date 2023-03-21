package com.sod.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import com.sod.entity.ContactUs;
import com.sod.service.ContactUsService;
import java.util.List;

// import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("/contact")
public class ContactUsController {

    ContactUsService contactUsService = new ContactUsService();

    @Path("/get_contacts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ContactUs> allContact() {
        return contactUsService.getContactUs();
    }

    @Path("/add")
    @POST
    public ContactUs createContactUs(@FormParam("name") String name,
            @FormParam("email") String email,
            @FormParam("number") String number,
            @FormParam("message") String message) {
        return contactUsService.createContactUs(name, email, number, message);
    }

}
