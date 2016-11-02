<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login page</title>
    <script src="views/basic/script/bootstrap.min.js"></script>
    <script src="views/basic/script/npm.js"></script>
    <link rel="stylesheet" href="views/basic/style/bootstrap.min.css" />
    <link rel="stylesheet" href="views/basic/style/bootstrap-theme.css" />
    <link rel="stylesheet" href="views/basic/style/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="views/style/login.css" />
</head>
<body>
<div class="body">
    <div class="main_panel">
        <span class="main_panel_title_bar">Please Login</span>
        <div class="main_panel_content">
<form name="login" action="/puerile/login" class="form-horizontal" method="post" role="form">
        <div class="form-group">
            <label for="username">用户名：</label>
            <input type="text" class="form-control" id="username" placeholder="请输入用户名">
        </div>
        <div class="form-group">
            <label for="password">密码：</label>
            <input type="text" class="form-control" id="password" placeholder="请输入密码">
        </div>
    <!--
<label>用户名:<input type="text" placeholder="用户名" name="username" tabindex="1"/></label><br>
<label>密  码:<input type="password" placeholder="密码" name="password" tabindex="2"/></label><br>-->
    <input type="submit" class="submit" id="loginBt" tabindex="3" value="登录"/>
</form>
        </div>
    </div>
</div>
</body>
</html>