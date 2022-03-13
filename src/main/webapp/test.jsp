<%--
  Created by IntelliJ IDEA.
  User: shiqunxing
  Date: 2021/3/17
  Time: 3:21 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<form action="">
    <input id="name" type="text" name="name">
</form>
<% out.print(request.getParameter("name")); %>

</body>
</html>
