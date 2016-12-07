<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


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