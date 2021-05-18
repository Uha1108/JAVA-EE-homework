<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021/4/29
  Time: 4:26 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link href="asset/css/team.css" rel="stylesheet">
    <link href="asset/css/footer.css" rel="stylesheet">
    <title>Hobby Results</title>
    <%@ include file="navbar.html" %>
</head>
<body>
<h2>The friends who share your hobby of ${requestScope.hobby} are:</h2>
<c:forEach items="${names}" var="name">
<tr>
    <td>
<${name}>
    </td>
</tr>
<div class="container">
    <div class="row">
        <div class="card" style="width: 18rem;">
            <img src=" ${name}image/.jpg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">${name}</h5>
                <p class="card-text">Hobby: ${requestScope.hobby}</p>
                <a href="#" class="btn btn-primary">Go to his/her page</a>
            </div>
        </div>
    </div>
</div>
</c:forEach>


<jsp:include page="footer.jsp" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

</body>
</html>