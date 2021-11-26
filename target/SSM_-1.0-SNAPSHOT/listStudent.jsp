<%--
  Created by IntelliJ IDEA.
  User: 吴国强
  Date: 2021-11-07
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>浏览学生</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
             $("#doAjax").click(function () {
               $.ajax({
                   url:"Student/queryStudent.do",
                   dataType:"json",
                   success:function (response) {
                        alert("resp"+response);
                   }
               })
             })
        })
    </script>
</head>
<body>
<table border="2" align="center">
    <thead>
    <p>浏览学生<input type="button" id="doAjax" value="获取学生数据"></p>
    <tr>
        <td>学生id</td>
        <td>学生姓名</td>
        <td>学生年龄</td>
    </tr>
    </thead>
     <tbody id="stuInfo">

     </tbody>
</table>
</body>
</html>
