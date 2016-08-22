<%--
  Created by IntelliJ IDEA.
  User: 烽
  Date: 2015/7/11
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>findUser</h1>
<table>
    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.birthday}</td>
            <td>${u.sex}</td>
            <td>${u.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

