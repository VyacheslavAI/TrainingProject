<%--
  Created by IntelliJ IDEA.
  User: DNS
  Date: 14.11.2018
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello First Page
<form method="post" action="${flowExecutionUrl}">
    <input type="hidden" name="_eventId" value="action"/>
    <input type="submit" value="Next Page"/>
</form>
</body>
</html>
