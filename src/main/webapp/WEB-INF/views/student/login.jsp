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
    <title>学生登录</title>
    <!-- For-Mobile-Apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="${ctx}/resources/css/login.css" type="text/css" media="all" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="${ctx}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${ctx}/resources/css/materialize.min.css">
    <link rel="stylesheet" href="${ctx}/resources/css/tooplate.css">
</head>
<body>
<div class="container">
    <div class="row tm-register-row tm-mb-35">
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-l">
            <form action="" method="post" class="tm-bg-black p-5 h-100">
                <div class="input-field">
                    <input placeholder="Sno" id="sno" name="sno" type="text" class="validate">
                </div>
                <div class="input-field mb-5">
                    <input placeholder="Password" id="password" name="password" type="password" class="validate">
                </div>
                <div class="tm-flex-lr">
                    <a href="#" class="white-text small">Forgot Password?</a>
                    <button type="submit" class="waves-effect btn-large btn-large-white px-4 black-text rounded-0">Login</button>
                </div>
            </form>
        </div>
        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 tm-login-r">
            <header class="font-weight-light tm-bg-black p-5 h-100">
                <h3 class="mt-0 text-white font-weight-light">Your Login</h3>
                <p>Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</p>
                <p class="mb-0">Vestibulum neque neque, porttitor quis lacinia eu, iaculis id dui. Mauris quis velit lectus.</p>
            </header>
        </div>
    </div>
</div>




</body>

<script src="${ctx}/resources/js/jquery-2.1.4.js"></script>
<script src="${ctx}/resources/js/materialize.min.js"></script>

<script>
    $(function() {
        $('select').formSelect();
        $("input").click(function(e) {
          e.preventDefault();
          var sno = $("#sno");
          var password = $("#password")
          $.ajax({
            url:'/student/checkLogin',
            data:{sno:sno,password:password},
            dataType:'json',
            type:'post',
            success:function(data) {
              if(data==true){
                alert("登录失败");
              }else{
                alert("学号或密码错误")
              }
            }
          })
        })
    })
</script>
</html>
