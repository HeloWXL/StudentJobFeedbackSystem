<%--
  Created by IntelliJ IDEA.
  User: yechengchao
  Date: 2019/9/10
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
<div id="top">
    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="/student/toStudentIndex">首页</a></li>
        <li class="layui-nav-item"><a href="">课程信息</a></li>
        <li class="layui-nav-item"><a href="">讨论区</a></li>
    </ul>
</div>

<div class="container">
    <div class="row clearfix" style="margin-top: -10px" >
        <div class="col-md-12 column">
            <h1 class="text-center text-success">
                课程详情
            </h1>
        </div>
    </div>
    <div class="row clearfix">
        <div style="background-color:#9d9d9d;width: 300px ;height: 800px ;margin-top: -35px" >
        <form class="layui-form" style="margin-top: 50px">
            <div class="layui-form-item">
                <br>
                <div class="layui-inline">
                    <label class="layui-form-label">学号：</label>
                    <div class="layui-input-inline">
                        <input type="text" name="sno"  autocomplete="off" class="layui-input" disabled="true">
                    </div>
                </div>
                <br>
                <div class="layui-inline">
                    <label class="layui-form-label">姓名：</label>
                    <div class="layui-input-inline">
                        <input type="text" name="name"  autocomplete="off" class="layui-input" disabled="true">
                    </div>
                </div>
                <br>
                <div class="layui-inline">
                    <label class="layui-form-label">专业：</label>
                    <div class="layui-input-inline">
                        <input type="text" name="profession"  autocomplete="off" class="layui-input" disabled="true">
                    </div>
                </div>
                <br>
                <div class="layui-inline">
                    <label class="layui-form-label">学院：</label>
                    <div class="layui-input-inline">
                        <input type="text" name="apartment"  autocomplete="off" class="layui-input" disabled="true">
                    </div>
                </div>
            </div>
        </form>
            <div>

        <div class="col-md-9 column" style="margin-left: 300px ; margin-top: -225px ;width: 900px">
            <c:forEach var="sc" items="${studentCourseListVo.courseList}">
                <div class="thumbnail" style="float: left;margin-left: 5px">
                    <img style="width: 145px;height: 135px;" src="${sc.coursePicture}" />
                    <div class="caption">
                        <h5>
                            课程：${sc.courseName }
                        </h5>

                    </div>
                    <button type="button" class="layui-btn layui-btn-normal add" style="margin-left: 20px" >提交作业</button>
                </div>
            </c:forEach>
        </div>
        <div class="col-md-3 c3olumn">
        </div>
    </div>
</div>
        <%--添加课程 弹出层代码  隐藏--%>
        <div style="text-align: center;display: none;margin-top: 10px;" id="submitWork" >
            <div class="layui-upload">
                <button type="button" class="layui-btn" id="test1" style="margin-bottom: 10px">上传作业</button>
            </div>

            <div style="margin-top: 10px">
                <p style="margin-left: -300px">请输入你这次作业的疑问：</p>
                <textarea style="margin-left: -20px;width: 450px;height: 100px" id="question" name="question"></textarea>

            </div>

            <div class="layui-form-item" style="margin-right: 75px; margin-top: 30px">
                <div class="layui-input-block">
                    <button class="layui-btn"  id="put">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </div>
</body>
<script src="${ctx}/resources/plugins/layui/layui.js"></script>
<script src="${ctx}/resources/js/jquery-2.1.4.js"></script>
<script src="${ctx}/resources/plugins/bootstrap-3.3.7/dist/js/bootstrap.js"></script>
<script>
    var studentId = "${studentsession.studentId}";
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
</script>
<script>
    $(function () {
        console.log(studentId)

        layui.use(['element','form','upload'], function(){
            var form = layui.form;
            var upload = layui.upload;
            var element = layui.element;
            var uploadInst = upload.render({
                elem: '#test1',
                url: ctx+'/assgin/insertAssgin',
                auto:false,
                method:'post',
                accept:'file',
                bindAction:'#put'
                ,before: function(){
                    this.data={
                        workId:1,studentId:parseInt(studentId),
                        qContent:$('#question').val()
                    };
                }
                ,done: function(res){
                    //如果上传失败
                    if(res.code < 0){
                        return layer.msg('添加失败');
                    }else{
                        layer.msg('提交成功',function () {
                            layer.close();
                        });
                    }
                }
            });
        });

        $(".add").click(function() {
            layer.open({
                id:1,
                type: 1,
                title: ['提交作业', 'font-size:18px;'],
                skin:'layui-layer-molv',
                anim: 1,
                area: ['600px', '350px'],
                offset: '100px',
                content: $("#submitWork")
            });
        })
    })

</script>
</html>
