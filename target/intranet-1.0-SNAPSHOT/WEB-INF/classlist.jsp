<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Klasseliste</title>
</head>
<body>

<h1>Klasseliste for hold B</h1>

<c:forEach var="student" items="${requestScope.studentlist}">
    ${student.name}, ${student.email}<br/>
</c:forEach>

</body>
</html>
