<%--
  Created by IntelliJ IDEA.
  User: prasad
  Date: 09/04/20
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><h3>Login Success Page</h3></title>
</head>
<body>
<h3><%= request.getAttribute("userName") %>Login Successful</h3>
<a href="logout.jsp">Login</a>
</body>
</html>
