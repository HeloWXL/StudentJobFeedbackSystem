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
            height: 210px;
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
                    <div  style="text-align: center">
                        <a>
                            <img src="${ctx}/resources/images/c1.png" style="width: 90%;height: 80%;">
                            <p>课程：<span>高等数学</span></p>
                            <p>班级：<span>计算机</span></p>
                        </a>
                    </div>
                    <div  style="text-align: center">
                        <a>
                            <img src="${ctx}/resources/images/c2.png" style="width: 90%;height: 80%;">
                            <p>课程：<span>高等数学</span></p>
                            <p>班级：<span>计算机</span></p>
                        </a>
                    </div>
                    <div  style="text-align: center">
                        <a>
                            <img src="${ctx}/resources/images/c3.png" style="width: 90%;height: 80%;">
                            <p>课程：<span>高等数学</span></p>
                            <p>班级：<span>计算机</span></p>
                        </a>
                    </div>
                    <div  style="text-align: center">
                        <a>
                            <img src="${ctx}/resources/images/c1.png" style="width: 90%;height: 80%;">
                            <p>课程：<span>高等数学</span></p>
                            <p>班级：<span>计算机</span></p>
                        </a>
                    </div>
                    <div  style="text-align: center">
                        <a>
                            <img src="${ctx}/resources/images/c4.png" style="width: 90%;height: 80%;">
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
    layui.use(['element','form','upload'], function(){
        var form = layui.form;
        var upload = layui.upload;
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
        //监听导航点击
        element.on('nav(demo)', function(elem){
            //console.log(elem)
            layer.msg(elem.text());
        });
        //添加课程
        $("#add").click(function() {
          layer.open({
            type: 1,
            skin:'layui-layer-molv',
            content: '<div style="width: 340px">\n' +
            '    <form class="layui-form">\n' +
            '        <div class="layui-form-item">\n' +
            '            <div class="layui-inline">\n' +
            '                <label class="layui-form-label">课程名</label>\n' +
            '                <div class="layui-input-inline">\n' +
            '                    <input type="text" name="courseName"  autocomplete="off" class="layui-input">\n' +
            '                </div>\n' +
            '            </div>\n' +

            '            <div class="layui-input-inline">\n' +
            '                <label class="layui-form-label">班级</label>\n' +
            '                <select name="classes">\n' +
            '                    <option value="1">16计算机</option>\n' +
            '                    <option value="2">17信管</option>\n' +
            '                    <option value="3">16物联网</option>\n' +
            '                    <option value="4">17软件工程</option>\n' +
            '                    <option value="5">18计算机</option>\n' +
            '                </select>\n' +
            '            </div>\n' +
            '        </div>\n' +

            '            <div class="layui-inline">\n' +
            '                <div class="layui-upload">\n' +
            '                    <button type="button" class="layui-btn" id="test1">上传图片</button>\n' +
            '                    <div class="layui-upload-list">\n' +
            '                        <img class="layui-upload-img" id="demo1" style="width: 50px;height: 50px;">\n' +
            '                        <p id="demoText"></p>\n' +
            '                    </div>\n' +
            '                </div>\n' +
            '            </div>\n' +
            '        <div class="layui-form-item">\n' +
            '            <div class="layui-input-block">\n' +
            '                <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>\n' +
            '                <button type="reset" class="layui-btn layui-btn-primary">重置</button>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </form>\n' +
            '\n' +
            '</div>\n' //这里content是一个普通的String
          });
        })

         //普通图片上传
        var uploadInst = upload.render({
        elem: '#test1'
        // ,url: '/upload/'
        ,before: function(obj){
          //预读本地文件示例，不支持ie8
          obj.preview(function(index, file, result){
            $('#demo1').attr('src', result); //图片链接（base64）
          });
        }
        ,done: function(res){
          //如果上传失败
          if(res.code > 0){
            return layer.msg('上传失败');
          }
          //上传成功

        }
      });


    });
</script>
</html>
