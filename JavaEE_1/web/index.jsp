<%--
  Created by IntelliJ IDEA.
  User: DNS
  Date: 19.09.2018
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

init jsp

<%!
    @Override
    public void jspInit() {
        System.out.println("initialization jsp two");
    };

    @Override
    public void jspDestroy() {
        System.out.println("destroy");
    }
%>
</body>
</html>
