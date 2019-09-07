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
    <title>学生首页</title>
    <link href="${ctx}/resources/plugins/layui/css/layui.css" rel="stylesheet" type="text/css" media="all">
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
                            <label class="layui-form-label">学号：</label>
                            <div class="layui-input-inline">
                                <input type="text" name="sno"  autocomplete="off" class="layui-input" disabled="true">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">姓名：</label>
                            <div class="layui-input-inline">
                                <input type="text" name="name"  autocomplete="off" class="layui-input" disabled="true">
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
                    <div style="width: 100%;height: 500px;background-color: #bbbbbb">

                        <div style="padding: 20px; background-color: #F2F2F2;">
                            <div class="layui-row layui-col-space15">
                                <div class="layui-col-md12">
                                    <h1 style="margin-bottom: 10px;text-align: center" >讨论区</h1>
                                    <div class="layui-card">
                                        <div class="layui-card-header">问题：卡片面板</div>
                                        <div class="layui-card-body">
                                            <span>叶成超：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                    </div>

                                    <div class="layui-card">
                                        <div class="layui-card-header">问题：卡片面板</div>
                                        <div class="layui-card-body">
                                            <span>叶成超：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                    </div>

                                    <div class="layui-card">
                                        <div class="layui-card-header">问题：卡片面板</div>
                                        <div class="layui-card-body">
                                            <span>叶成超：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                    </div>

                                    <div class="layui-card">
                                        <div class="layui-card-header">问题：卡片面板</div>
                                        <div class="layui-card-body">
                                            <span>叶成超：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                        <div class="layui-card-body">
                                            <span>王咸林：</span>
                                            <p>卡片式面板面板通常用于非白色背景色的主体内从而映衬出边框投影</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
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
    if("${studentsession}"==""){
        location.href="/student//toStudentLogin"
    }else{
        // 通过session获取用户的信息
        $(function () {
            $("input[name='sno']").val("${studentsession.studentSno}");
            $("input[name='name']").val("${studentsession.studentName}");
            $("input[name='profession']").val("${studentsession.studentProfession}");
            $("input[name='apartment']").val("${studentsession.studentApartment}");
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
