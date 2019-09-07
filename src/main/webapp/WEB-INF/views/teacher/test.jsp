<%--
  Created by IntelliJ IDEA.
  User: 王咸林
  Date: 2019/9/7
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
    <style>
        .pdfobject-container {
            height: 500px;
            width: 700px;
            margin: 0 auto;
        }
        .pdfobject {
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>
    <%--<iframe  src="${ctx}/resources/pdf/基于Face++_人脸检测以及人脸对比实验.pdf" width="800" height="600"></iframe>--%>
    <div id="pdf"></div>
</body>
<script src="${ctx}/resources/js/pdfobject.js"></script>
<script>
  PDFObject.embed('${ctx}/resources/pdf/基于Face++_人脸检测以及人脸对比实验.pdf', '#pdf');
</script>
</html>
