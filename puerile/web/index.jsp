<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login page</title>
<link rel="stylesheet" href="views/style/login.css" />
</head>
<body>
<div class="body">
<div class="main_panel">
Please login<br>
<form name="login" action="/puerile/login" method="post">
<label>用户名:<input type="text" placeholder="用户名" name="username" tabindex="1"/></label><br>
<label>密  码:<input type="password" placeholder="密码" name="password" tabindex="2"/></label><br>
    <input type="submit" class="submit" id="loginBt" tabindex="3" value="登录"/>
</form>
</div>
</div>
</body>
</html>