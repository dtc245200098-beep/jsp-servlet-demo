package com.codegym;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Hello Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Xin chào từ HelloServlet!</h1>");
            out.println("<p>URL: <code>/hello</code></p>");
            out.println("<a href=\"index.jsp\">Quay về trang chủ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
