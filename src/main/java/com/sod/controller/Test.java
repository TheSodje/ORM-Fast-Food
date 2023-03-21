package com.sod.controller;

import jakarta.ws.rs.*;

@Path("/hello-world")
public class Test {

  @GET
  @Produces("text/plain")
  public String hello() {
    return "Hello, World!";
  }
}