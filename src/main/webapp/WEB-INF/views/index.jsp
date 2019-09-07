<%--
  Created by IntelliJ IDEA.
  User: 王咸林
  Date: 2019/8/29
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<html>
<head>
    <title>学生作业反馈系统</title>
    <!-- For-Mobile-Apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script>
      addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
      }, false);
      function hideURLbar() {
        window.scrollTo(0, 1);
      }
    </script>
    <!-- css files -->
    <link href="${ctx}/resources/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
    <link href="${ctx}/resources/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- //css files -->
    <!-- google fonts -->
    <link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <!-- //google fonts -->
    <style>
        h1{
            font-family: "'Raleway', sans-serif";
        }
        a{
            margin: 10px 20px;
        }
    </style>
</head>
<body>
<div class="signupform">
    <div class="container">
        <!-- main content -->
        <div class="agile_info">
            <div class="w3l_form">
                <div class="left_grid_info">
                    <h1>学生作业反馈系统</h1>
                    <img src="${ctx}/resources/images/user.jpg" alt="" />
                </div>
            </div>
            <div class="w3_info">
                    <a href="/student/toStudentLogin"><button class="btn btn-danger btn-block" type="submit" id="student">学生登录 </button ></a>
                    <a href="/teacher/toTeacherLogin"><button class="btn btn-danger btn-block" type="submit" id="teacher">教师登录</button ></a>

            </div>
        </div>
        <!-- //main content -->
    </div>
</div>
</body>
<script src="${ctx}/resources/js/jquery-2.1.4.js"></script>
</html>
