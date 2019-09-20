<%--
  Created by IntelliJ IDEA.
  User: shaofengl
  Date: 2019/8/11
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:forEach items="${users}" var="user">
        <c:out value="${user.username}"></c:out> </br>
        <c:out value="${user.age}"></c:out> </br>

    </c:forEach>
</head>
<body>

</body>
</html>
