package com.sod.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class Test {

  @GET
  @Produces("text/plain")
  public String hello() {
    return "Hello, World!";
  }
}