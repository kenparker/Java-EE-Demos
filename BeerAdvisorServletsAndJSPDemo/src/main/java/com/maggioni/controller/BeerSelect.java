
package com.maggioni.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeerSelect extends HttpServlet {

    static private final Logger log = LoggerFactory.getLogger("root.Beer");

    @Override
    public void init() throws ServletException {
        log.info("Init startet");
    }


    @Override
    public void destroy() {
        log.info("destroy startet");       
    }
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br>");
        String color = request.getParameter("color");
        out.println("<br>Got beer color " + color);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("doGet called");
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("doPost called");
        processRequest(request, response);
    }


}
