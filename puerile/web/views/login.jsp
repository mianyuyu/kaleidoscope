<%--
  Created by IntelliJ IDEA.
  User: bruce
  Date: 2016/7/31
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login page</title>
    <script src="/views/basic/js/bootstrap.min.js"></script>
    <script src="/views/basic/js/npm.js"></script>
    <link rel="stylesheet" href="/views/basic/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/views/basic/css/bootstrap-theme.css" />
    <link rel="stylesheet" href="/views/basic/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="/views/style/login.css" />
</head>
<body>
<div class="body">
    <div class="container">
        <form:form action="/puerile/login" method="post" class="form-signin" role="form">
            <div class="form_element">
                <h2 class="form-signin-heading">Please sign in</h2>
            </div>
            <div class="form_text_element">
                <input type="username" class="form-control" placeholder="Your account" required autofocus>
                <input type="password" class="form-control" placeholder="Password" required>
            </div>
            <div class="form_select_element">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
            </div>
            <div class="form_element">
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>
