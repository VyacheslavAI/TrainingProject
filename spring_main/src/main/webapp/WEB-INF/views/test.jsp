<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
Hello <security:authentication property="principal.username"/>
<a href="logout">logout</a>

<br/>
<br/>

<security:authorize access="isAuthenticated()">
    this information for logged users
</security:authorize>

<br/>
<br/>

<security:authorize access="hasRole('moderator')">
    this information for moderators
</security:authorize>

<br/>
<br/>

<security:authorize access="hasRole('admin')">
    this information for admins
</security:authorize>

<br/>
<br/>

<security:authorize access="hasRole('moderator') or hasRole('admin')">
    this info for all gods
</security:authorize>

<br/>
<br/>

<security:authorize access="hasRole('admin')">
    <spring:url value="/home" var="home_var"/>
    <a href="${home_var}">go to home page</a>
</security:authorize>
</body>
</html>
