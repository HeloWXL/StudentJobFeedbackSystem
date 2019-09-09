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
    <title>课程详情</title>
    <link href="${ctx}/resources/plugins/layui/css/layui.css" rel="stylesheet" type="text/css" media="all">
    <link href="${ctx}/resources/plugins/bootstrap-3.3.7/dist/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">

    <script>
        var ctx = '${ctx}'
    </script>
    <style>
        a img{
            margin-top: 10px;
            border-radius: 15px;
            width: 50%;
            height: 60%;
        }
        body{
            font-family: 黑体;
        }
        #course div{
            border-radius: 15px;
            float: left;
            height: 28%;
            background-color: #ffffff;
            margin-top: 10px;
            margin-left: 10px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center text-success">
                h3. 这是一套可视化布局系统.
            </h3>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-6 column">
            <c:forEach var="wc" items="${workCourseVoList }">
                <div class="thumbnail" style="float: left;margin-left: 5px">
                    <img style="width: 200px;height: 170px;" src="${ctx}/resources/images/assgin.png" />
                    <div class="caption">
                        <h3>
                            课程：${wc.courseName }
                        </h3>
                        <p>
                            作业内容：${wc.workName}
                        </p>
                        <p>
                            <a class="btn btn-primary" href="/assgin/getAssginByWorkId/${wc.workId}">查看详情</a>
                        </p>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="col-md-4 column">
        </div>
    </div>
</div>
</body>
<script src="${ctx}/resources/plugins/layui/layui.js"></script>
<script src="${ctx}/resources/js/jquery-2.1.4.js"></script>
<script src="${ctx}/resources/plugins/bootstrap-3.3.7/dist/js/bootstrap.js"></script>
</html>
