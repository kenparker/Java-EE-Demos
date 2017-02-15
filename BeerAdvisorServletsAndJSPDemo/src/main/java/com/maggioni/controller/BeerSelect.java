package com.maggioni.controller;

import com.maggioni.model.BeerExpert;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeerSelect extends HttpServlet {

    static private final Logger log = LoggerFactory.getLogger("root.Beer");
    private PrintWriter out;
    
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
        String color = request.getParameter("color");

        BeerExpert beerExpert = new BeerExpert();
        List brands = beerExpert.getBrands(color);
        log.info("BeerExpert Object : {}", beerExpert);

        request.setAttribute("styles", brands);
        
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
        
    }

    private void setupHtmlHeader(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        out.println("Beer Selection Advice<br>");

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
