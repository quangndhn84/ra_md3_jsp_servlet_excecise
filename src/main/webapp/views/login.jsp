<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 24/06/2024
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/LoginServlet" method="post">
    <label for="userName">Username</label>
    <input type="text" name="userName" id="userName"/><br>
    <label for="password">Password</label>
    <input type="password" name="password" id="password"/><br>
    <input type="submit" value="login"/>
</form>
<p style="color: red"><c:if test="${result=='error'}">Tài khoản hoặc mật khẩu không chính xác</c:if></p>
</body>
</html>
