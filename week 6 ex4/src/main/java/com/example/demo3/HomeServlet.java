package com.example.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
@WebServlet(name = "HomeServlet", value = "/index")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        if (user == null) {
            request.setAttribute("user", "Guest");
            request.setAttribute("buttonName", "Sign In");
            request.setAttribute("buttonLink", "sign-in");
        }
        else {
            request.getSession().setAttribute("user", user);
            request.setAttribute("buttonName", "Log Out");
            request.setAttribute("buttonLink", "log-out");
        }
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
