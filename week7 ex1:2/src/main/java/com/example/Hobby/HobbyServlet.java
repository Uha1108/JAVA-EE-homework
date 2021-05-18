package com.example.Hobby;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "HobbyServlet", value = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, ArrayList<String>> userHobby;
    @Override
    public void init() {
        userHobby = new HashMap<>();
        ArrayList<String> a1=new ArrayList<>();
        a1.add("skiing");
        a1.add("dancing");
        ArrayList<String> a2=new ArrayList<>();
        a2.add("skiing");
        a2.add("dancing");
        ArrayList<String> a3=new ArrayList<>();
        a3.add("knitting");
        a3.add("dancing");
        ArrayList<String> a4=new ArrayList<>();
        a4.add("knitting");
        a4.add("dancing");
        ArrayList<String> a5=new ArrayList<>();
        a5.add("scuba");
        a5.add("singing");
        ArrayList<String> a6=new ArrayList<>();
        a6.add("scuba");
        a6.add("singing");
        ArrayList<String> a7=new ArrayList<>();
        a7.add("dating");
        a7.add("singing");
        ArrayList<String> a8=new ArrayList<>();
        a8.add("dating");
        a8.add("singing");
        ArrayList<String> a9=new ArrayList<>();
        a9.add("dating");
        a9.add("singing");
        userHobby.put("Bob", a1);
        userHobby.put("Jim", a2);
        userHobby.put("James", a3);
        userHobby.put("Tom", a4);
        userHobby.put("Fei", a5);
        userHobby.put("Jone", a6);
        userHobby.put("Fred", a7);
        userHobby.put("Pradeep", a8);
        userHobby.put("Philippe", a9);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hobby = request.getParameter("hobby");
        List<String> names = new ArrayList<>();
        userHobby.forEach((k, v) -> {
            if (v.contains(hobby)) {
                names.add(k);
            }
        });
        request.setAttribute("names", names);
        request.setAttribute("hobby",hobby);
        request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }
}