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
    <style>
        a img{
            margin-top: 10px;
            border-radius: 15px;
        }
        body{
            font-family: 黑体;
        }
        #course div{
            border-radius: 15px;
            float: left;
            width: 175px;
            height: 250px;
            background-color: #ffffff;
            margin-top: 10px;
            margin-left: 10px;
            margin-bottom: 10px;
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
<div class="layui-container" style="margin-top: 10px">
    <div class="layui-row layui-col-space30">
        <div class="layui-col-md4">
            <div class="grid-demo grid-demo-bg1">
                <form class="layui-form">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">工号：</label>
                            <div class="layui-input-inline">
                                <input type="text" name="tno"  autocomplete="off" class="layui-input" disabled="true">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">姓名：</label>
                            <div class="layui-input-inline">
                                <input type="text" name="name"  autocomplete="off" class="layui-input" disabled="true">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">职称：</label>
                            <div class="layui-input-inline">
                                <input type="text" name="jobTitle"  autocomplete="off" class="layui-input" disabled="true">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">专业：</label>
                            <div class="layui-input-inline">
                                <input type="text" name="profession"  autocomplete="off" class="layui-input" disabled="true">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">学院：</label>
                            <div class="layui-input-inline">
                                <input type="text" name="apartment"  autocomplete="off" class="layui-input" disabled="true">
                            </div>
                        </div>
                    </div>
                </form>
                <button type="button" class="layui-btn layui-btn-normal" id="add">添加课程</button>
            </div>
        </div>
        <div class="layui-col-md8">
            <div class="grid-demo">
                <div id="course" style="width: 100%;height: 100%;background-color: #bbbbbb">
                    <c:forEach var="c" items="${courseMap.data}">
                    <div  style="text-align: center">
                        <a>
                            <img src="/resources/${c.coursePicture}" style="width: 90%;height: 80%;">
                            <p>课程：<span>${c.courseName}</span></p>
                            <p>班级：<span>${c.className}</span></p>
                        </a>
                    </div>
                    </c:forEach>
                </div>
            </div>
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
                        <option value="2">17物联网</option>
                        <option value="3">15信管</option>
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
<script src="${ctx}/resources/js/teacherIndex.js"></script>
<script>
    //判断用户是否登陆
    if("${teachersession}"==""){
        location.href="/teacher/toTeacherLogin"
    }else{
        // 通过session获取用户的信息
        $(function () {
            $("input[name='tno']").val("${teachersession.teacherTno}");
            $("input[name='name']").val("${teachersession.teacherName}");
            $("input[name='jobTitle']").val("${teachersession.teacherJobTitle}");
            $("input[name='profession']").val("${teachersession.teacherProfession}");
            $("input[name='apartment']").val("${teachersession.teacherApartment}");
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
