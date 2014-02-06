package org.cccs.dtd.example.web;

import org.cccs.dtd.example.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by boycook on 06/02/2014.
 */
public class ExampleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person p = new Person();
        p.setAge(20);
        p.setFirstName("Bob");
        p.setLastName("Smith");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person p = new Person();
        p.setAge(30);
        p.setFirstName("Bob");
        p.setLastName("Smith");
    }
}
