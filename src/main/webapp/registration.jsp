<%--
  Created by IntelliJ IDEA.
  User: prasad
  Date: 09/04/20
  Time: 4:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registeration Page</title>
</head>
<body>
<center>
    <form action="RegistrationController" method="post">
        <br/>FirstName:<input type="text" name="fname">
        <br/>LastName:<input type="text" name="lname">
        <br/>Email:<input type="text" name="email">
        <br/>ContactNo:<input type="text" name="mobileNo">
        <br/>Username:<input type="text" name="userName">
        <br/>Password:<input type="password" name="password">
        <br/><input type="submit" value="Submit">
    </form>
</center>
</body>
</html>
