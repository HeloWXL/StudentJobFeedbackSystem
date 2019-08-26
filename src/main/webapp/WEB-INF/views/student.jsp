<%--
  Created by IntelliJ IDEA.
  User: 王咸林
  Date: 2019/8/27
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Student</title>
</head>
<body>
<table  border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
        <td>sex</td>
        <td>createtime</td>
        <td>updatetime</td>
    </tr>
    <c:forEach items="${studentList}" var="s" >
        <tr>
            <td>${s.id}</td>
            <td>${s.sname}</td>
            <td>${s.sage}</td>
            <td>${s.ssex}</td>
            <td>${s.createtime}</td>
            <td>${s.updatetime}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
