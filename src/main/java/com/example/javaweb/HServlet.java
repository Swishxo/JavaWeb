package com.example.javaweb;

import jakarta.ws.rs.*;

@Path("/hello-world")
public class HServlet {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}