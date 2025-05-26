<%--
  Created by IntelliJ IDEA.
  User: 许腾飞
  Date: 2025/5/16
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我猜中文会乱码</title>
</head>
<body>
    <%
        String id =request.getParameter("id");
        String pwd =request.getParameter("pwd");
        out.println("id:"+id+"<br>");
        out.print("pwd:"+pwd);
    %>
</body>
</html>
