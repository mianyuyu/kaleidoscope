<%--
  Created by IntelliJ IDEA.
  User: bruce
  Date: 2016/7/31
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>This is the login page</title>
</head>
<body>
Please login<br>
<form:form action="/puerile/login" method="post">
 <label>用户名:<form:input path="username" placeholder="用户名" tabindex="1"></form:input></label><br/>
 <label>密  码:<form:password path="password" placeholder="密码" tabindex="2"></form:password></label><br/>
    <input type="submit" class="submit" id="loginBt" tabindex="3" value="登录"/>
</form:form>
</body>
</html>
