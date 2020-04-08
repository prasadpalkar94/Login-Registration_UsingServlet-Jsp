<%--
  Created by IntelliJ IDEA.
  User: prasad
  Date: 09/04/20
  Time: 3:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogOut</title>
</head>
<body>
<%

    session.removeAttribute("userName");
    session.removeAttribute("password");
    session.invalidate();
%>
<h1>Logout was done successfully.</h1>
</body>
</html>
