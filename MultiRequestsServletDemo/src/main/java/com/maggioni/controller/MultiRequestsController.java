package com.maggioni.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(urlPatterns = {"MultiRequests"})
public class MultiRequestsController extends HttpServlet{

    private static Logger logger = (Logger) LoggerFactory.getLogger("root.MultiRequestsController");
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Info Message1");
        logger.info("Info Message2");
        logger.debug("Debug Message");
    }
    
    
    
}
