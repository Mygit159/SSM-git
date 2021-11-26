<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 吴国强
  Date: 2021-11-07
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<table border="2" align="center">
    <p>注册学生</p>
    <form action="Student/addStudent.do" method="post">
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="name" ></td>
        </tr>
        <tr>
            <td>学生年龄：</td>
            <td><input type="text" name="age" ></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册" ></td>
        </tr>
    </form>
</table>
</body>
</html>
