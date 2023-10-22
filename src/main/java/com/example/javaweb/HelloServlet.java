package com.example.javaweb;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.WriteListener;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")//value is url mapping
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

        message = "Hello Steph!";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Get request made to /hello");

        //type of response your sending
        response.setContentType("text/html");
        //actual responses sent to users
        response.getWriter().println("<h1>About Me!</h1>");
        response.getWriter().println("<p>An ambitious young\n" +
                "leader that was able to\n" +
                "cultivate an interest in\n" +
                "technology with the help\n" +
                "of the Military. I am\n" +
                "passionate about\n" +
                "Software development\n" +
                "with hopes of one day\n" +
                "becoming a Mobile\n" +
                "developer.</p>");

        response.getWriter().println("<div>");
        response.getWriter().println("<h1>Key Skills</h1>");
        response.getWriter().println("JAVA | PYTHON | C# | COMPUTER HARDWARE | LOCAL\n" +
                "AREA NETWORKS | WAVELENGTH THEORY | ANTENNA\n" +
                "THEORY");

        response.getWriter().println("<div>");
        response.getWriter().println("<h1>Awards & Honors</h1>");
        response.getWriter().println("Army Achievement Medal\nGlobal War on Terrorism Service Medal\nKorea Defense Service Medal\nArmy Service Ribbon");
    }

    public void destroy() {
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post request made to /hello");
    }
}