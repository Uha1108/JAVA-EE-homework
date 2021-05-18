package com.example.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.BiConsumer;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("sign-in.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap<String, String> userName = new HashMap<>();
        userName.put("Bob","123");
        userName.put("Jim","456");
                String name = request.getParameter("inputName");
                String password = request.getParameter("inputPassword");
                if (!userName.containsKey(name)){
                    request.getRequestDispatcher("errorpage.html").forward(request, response);
                }else{
                    if (!userName.get(name).equals(password)){
                        request.getRequestDispatcher("errorpage.html").forward(request, response);
                    }else{
                        request.getSession().setAttribute("user", name);
                        response.sendRedirect("index");
                    }
                }


            }
        }


