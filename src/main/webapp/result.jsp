<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021/3/28
  Time: 9:10 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.example.beer_v1.model.Beer" %>
<%@ page import="java.io.IOException" %>
<html>
<head>
    <title>Beer Recommended JSP</title>
</head>
<body>
<%
    List<Beer> styles = (List<Beer>) request.getAttribute("styles");
    out.println("<br/>this is a jsp page");
    for (Beer brand: styles) {
        out.println("<br/>try: " + brand);
    }
%>

</body>
</html>
