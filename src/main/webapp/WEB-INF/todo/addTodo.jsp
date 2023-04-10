<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/8 0008
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <div>${msg}</div>
    <form action="/todo/addTodo.do" method="post">
        <textarea name="text"></textarea>
        <input type="submit" value="Add "/>
    </form>

</body>
</html>
