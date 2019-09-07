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
</head>
<body>
<div id="top">
    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="">最新活动</a></li>
        <li class="layui-nav-item"><a href="">大数据</a></li>
        <li class="layui-nav-item"><a href="">社区</a></li>
        <style>
            body{
                font-family: 黑体;
            }
            #course div{
                border-radius: 15px;
                float: left;
                width: 175px;
                height: 190px;
                background-color: #ffffff;
                margin-top: 10px;
                margin-left: 10px;
                margin-bottom: 10px;
            }
        </style>
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

            </div>
        </div>
        <div class="layui-col-md8">
            <div class="grid-demo">
                        <div id="course" style="width: 100%;height: 100%;background-color: #bbbbbb">
                            <div  style="text-align: center">
                                <a>
                                    <img src="${ctx}/resources/images/course.png" style="width: 90%;height: 80%;">
                                    <p>课程：<span>高等数学</span></p>
                                    <p>班级：<span>计算机</span></p>
                                </a>
                            </div>
                            <div  style="text-align: center">
                                <a>
                                    <img src="${ctx}/resources/images/course.png" style="width: 90%;height: 80%;">
                                    <p>课程：<span>高等数学</span></p>
                                    <p>班级：<span>计算机</span></p>
                                </a>
                            </div>
                            <div  style="text-align: center">
                                <a>
                                    <img src="${ctx}/resources/images/course.png" style="width: 90%;height: 80%;">
                                    <p>课程：<span>高等数学</span></p>
                                    <p>班级：<span>计算机</span></p>
                                </a>
                            </div>
                            <div  style="text-align: center">
                                <a>
                                    <img src="${ctx}/resources/images/course.png" style="width: 90%;height: 80%;">
                                    <p>课程：<span>高等数学</span></p>
                                    <p>班级：<span>计算机</span></p>
                                </a>
                            </div>
                            <div  style="text-align: center">
                                <a>
                                    <img src="${ctx}/resources/images/course.png" style="width: 90%;height: 80%;">
                                    <p>课程：<span>高等数学</span></p>
                                    <p>班级：<span>计算机</span></p>
                                </a>
                            </div>

                        </div>
            </div>
        </div>
    </div>
</div>



</body>

<script src="${ctx}/resources/plugins/layui/layui.js"></script>
<script src="${ctx}/resources/js/jquery-2.1.4.js"></script>

<script>
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
    layui.use('element', function(){
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
        //监听导航点击
        element.on('nav(demo)', function(elem){
            //console.log(elem)
            layer.msg(elem.text());
        });
    });
</script>
</html>
