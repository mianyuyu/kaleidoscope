<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login page</title>
    <!--
    <script src="/js/jquery-2.2.4.min.js"></script>
    <script src="/basic/js/bootstrap.min.js"></script>
    <script src="/basic/js/npm.js"></script>-->
    <link rel="stylesheet" href="/basic/css/bootstrap.min.css" />
    <!--<link rel="stylesheet" href="/basic/css/bootstrap-theme.min.css" />-->
    <link rel="stylesheet" href="/css/login.css" />
</head>
<body>
    <!--如果它以斜杠开头,那么它就是一个环境相关的路径.将根据赋给应用程序的URI的前缀进行解释,
    如果它不是以斜杠开头,那么就是页面相关的路径,就根据引入这个文件的页面所在的路径进行解释-->
    <%@ include file="views/login.jsp"%>
</body>
</html>