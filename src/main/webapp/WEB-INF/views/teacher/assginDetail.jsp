<%--
  Created by IntelliJ IDEA.
  User: wangxianlin
  Date: 2019/9/8
  Time: 11:16 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>作业详情</title>
    <link href="${ctx}/resources/plugins/layui/css/layui.css" rel="stylesheet" type="text/css" media="all">
    <script>
        var ctx = '${ctx}'
    </script>
    <style>
        a img{
            margin-top: 10px;
            border-radius: 5px;
            width: 50%;
            height: 60%;
        }
        body{
            font-family: 黑体;
        }
        #course div{
            border-radius: 15px;
            float: left;
            width: 30%;
            height: 32%;
            background-color: #ffffff;
            margin-top: 10px;
            margin-left: 10px;
            margin-bottom: 10px;
        }

    </style>
</head>
<body>
<div class="layui-row">
    <div class="layui-col-xs2">
        <div class="grid-demo grid-demo-bg1">

        </div>
    </div>
    <div class="layui-col-xs10">
        <div class="grid-demo">
            <div id="course" style="width: 90%;height: 100%;background-color: #bbbbbb">
                <c:forEach var="a" items="${assginStudentVoList }">
                    <div  style="text-align: center">
                        <a name="${a.assginId}">
                            <img src="${ctx}/resources/images/assgin.png" >
                            <p>学号：<span>${a.studentSno}</span></p>
                            <p>姓名：<span>${a.studentName}</span></p>
                            <p>提交时间：<span>${a.createTime}</span></p>
                        </a>
                    </div>
                </c:forEach>
            </div>

        </div>
    </div>
</div>
</body>
<script src="${ctx}/resources/plugins/layui/layui.js"></script>
<script src="${ctx}/resources/js/jquery-2.1.4.js"></script>
</html>
