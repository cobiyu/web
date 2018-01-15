package com.cobi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Idx")
public class Idx extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doget");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dogetfdas");

        PrintWriter writer = response.getWriter();
        request.setAttribute("id", "cobiyu");
        request.setAttribute("pw", "1234");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
        dispatcher.forward(request,response);
    }
}

