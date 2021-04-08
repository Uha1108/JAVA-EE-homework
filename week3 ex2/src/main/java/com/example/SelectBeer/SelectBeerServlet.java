package com.example.SelectBeer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.spi.NumberFormatProvider;

@WebServlet(name = "SelectBeerServlet", value = "/SelectBeerServlet")
public class SelectBeerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String body = request.getParameter("body");
        String[] sizes = request.getParameterValues("sizes");
        String amount =request.getParameter("amount") ;
        try{
           int i=Integer.valueOf(amount);
        }catch(NumberFormatException E){
            response.sendRedirect("errorpage.html");
        }
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>This is post response</h1>");
            out.println("<p>body: " + body + "</p>");
            out.println("<p>amount: " + amount + "</p>");
            for (String s : sizes) {
                out.println("<p>sizes: " + s + "</p>");
                out.println("</body></html>");
            }

    }
}


