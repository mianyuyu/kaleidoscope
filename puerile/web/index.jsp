<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login page</title>
</head>
<body>
    <!--如果它以斜杠开头,那么它就是一个环境相关的路径.将根据赋给应用程序的URI的前缀进行解释,
    如果它不是以斜杠开头,那么就是页面相关的路径,就根据引入这个文件的页面所在的路径进行解释-->
    <%@ include file="views/login.jsp"%>
</body>
</html>