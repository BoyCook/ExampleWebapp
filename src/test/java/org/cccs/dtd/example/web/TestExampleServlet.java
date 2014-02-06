package org.cccs.dtd.example.web;

import org.cccs.dtd.example.Person;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;

/**
 * Created by boycook on 06/02/2014.
 */
public class TestExampleServlet {

    private Person person;
    private ExampleServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setup() {
        person = mock(Person.class);
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        servlet = new ExampleServlet();
    }

    @Test
    public void doPostShouldWork() throws ServletException, IOException {
        servlet.doPost(request, response);
    }

    @Test
    public void doGetShouldWork() throws ServletException, IOException {
        servlet.doGet(request, response);
    }
}
