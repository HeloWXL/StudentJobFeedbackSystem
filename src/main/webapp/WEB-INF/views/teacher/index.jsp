<%--
  Created by IntelliJ IDEA.
  User: 王咸林
  Date: 2019/9/1
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>教师首页</title>
    <link href="${ctx}/resources/plugins/layui/css/layui.css" rel="stylesheet" type="text/css" media="all">
    <link href="${ctx}/resources/plugins/bootstrap-3.3.7/dist/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
    <style>
        body{
            font-family: 黑体;
        }

    </style>
</head>
<body>
<div id="top">
    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="">最新活动</a></li>
        <li class="layui-nav-item"><a href="">大数据</a></li>
        <li class="layui-nav-item"><a href="">社区</a></li>

    </ul>
</div>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3 class="text-center text-info">
                Welcome To My House
            </h3>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-2 column">
            <div class="list-group">
                <a href="#" class="list-group-item active" id="add">添加课程</a>
                <%--<div class="list-group-item">--%>
                    <%--List header--%>
                <%--</div>--%>
                <%--<div class="list-group-item">--%>
                    <%--<h4 class="list-group-item-heading">--%>
                        <%--List group item heading--%>
                    <%--</h4>--%>
                    <%--<p class="list-group-item-text">--%>
                        <%--...--%>
                    <%--</p>--%>
                <%--</div>--%>
                <%--<div class="list-group-item">--%>
                    <%--<span class="badge">14</span> Help--%>
                <%--</div> <a class="list-group-item active"> <span class="badge">14</span> Help</a> -->--%>
            </div>
        </div>
        <div class="col-md-6 column">
            <c:forEach var="c" items="${courseMap.data}">
                <div class="thumbnail" style="float: left;margin-left: 5px">
                    <img style="width: 140px;height: 115px;" src="${c.coursePicture}" />
                    <div class="caption">
                        <h3>
                                ${c.courseName}
                        </h3>
                        <p>
                                ${c.className}
                        </p>
                        <p>
                            <a class="btn btn-primary" href="/work/getWorkByCourseId/${c.couserId}">查看详情</a>
                        </p>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="col-md-4 column">
            <dl class="dl-horizontal">
                <dt>
                    工号:
                </dt>
                <dd name="tno">
                </dd>
                <dt>
                    姓名:
                </dt>
                <dd name="name">

                </dd>
                <dt>
                    职称
                </dt>
                <dd name="jobTitle">
                </dd>
                <dt>
                    专业:
                </dt>
                <dd name="profession">
                </dd>
                <dt>
                    学院:
                </dt>
                <dd name="apartment" >
                </dd>
            </dl>
        </div>
    </div>
</div>
<%--添加课程 弹出层代码  隐藏--%>
<div style="text-align: center;display: none" id="addcourse">
    <div class="layui-upload" style="margin-left: 70px;">
        <div class="layui-upload-list">
            <img class="layui-upload-img" id="demo1" style="width: 100px;height: 100px">
        </div>
        <button type="button" class="layui-btn" id="test1" style="margin-bottom: 10px">上传图片</button>
    </div>
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">课程名：</label>
                <div class="layui-input-inline">
                    <input type="text" name="courseName" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">班级：</label>
                <div class="layui-input-inline">
                    <select name="classes" lay-filter="aihao">
                        <option value="1">16计算机</option>
                        <option value="2">15计算机</option>
                        <option value="3">16物联网</option>
                        <option value="4">16信管</option>
                        <option value="5">15信管</option>
                    </select>
                </div>
            </div>
        </div>
    </form>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" id="put">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</div>
</div>
</body>

<script src="${ctx}/resources/plugins/layui/layui.js"></script>
<script src="${ctx}/resources/js/jquery-2.1.4.js"></script>
<script src="${ctx}/resources/plugins/bootstrap-3.3.7/dist/js/bootstrap.js"></script>
<script src="${ctx}/resources/js/teacherIndex.js"></script>
<script>
    //判断用户是否登陆
    if("${teachersession}"==""){
        location.href="/teacher/toTeacherLogin"
    }else{
        // 通过session获取用户的信息
        $(function () {
            $("dd[name='tno']").html("${teachersession.teacherTno}");
            $("dd[name='name']").html("${teachersession.teacherName}");
            $("dd[name='jobTitle']").html("${teachersession.teacherJobTitle}");
            $("dd[name='profession']").html("${teachersession.teacherProfession}");
            $("dd[name='apartment']").html("${teachersession.teacherApartment}");
        })
    }

    <%--$(function () {--%>
    <%--    //alert(${teachersession.teacherId});--%>
    <%--    var teacherId="${teachersession.teacherId}";--%>
    <%--      //alert(teacherId);--%>
    <%--    $.ajax({--%>
    <%--        url:'/course/selectCourseByTid',--%>
    <%--        data:{tid:teacherId},--%>
    <%--        dataType:'json',--%>
    <%--        type:'get',--%>
    <%--        success:function(data) {--%>
    <%--            console.log(data);--%>
    <%--        }--%>
    <%--    })--%>
    <%--})--%>
</script>
</html>
