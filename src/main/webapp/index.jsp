<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Intranet</h1>

<c:if test="${empty(sessionScope.user)}">
    <p>Du kan log ind her: <a href="login.jsp">Login</a></p>
</c:if>

<c:if test="${sessionScope.user != null}">
    Status: ${requestScope.message}
    <p>Status på login: ${sessionScope.message}
    </p>${sessionScope.user.login} ${sessionScope.user.password} ${sessionScope.user.role}</p>
    <p><a href="classlist">Se klasseliste</a> </p>
</c:if>

<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>


</body>
</html>