<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="wow" uri="/tld/MyTag.tld" %>
<%@ taglib prefix="man" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <wow:MyTag name = "Slava">yohoho ${two}<br/> 5 - 1 = ${wow:minus(5, 1)}
        <wow:mit></wow:mit>
    </wow:MyTag>
    <br/>
    <man:MyJspTag name = "Max">yohoho</man:MyJspTag>
</body>
</html>
