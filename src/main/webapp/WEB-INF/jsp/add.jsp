<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/12
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/students" method="POST">
    姓名<input type="text" name="name"/>
    QQ<input type="text" name="qq"/>
    修真类型<input type="text" name="curricular"/>
    毕业院校<input type="text" name="college"/>
    日报链接<input type="text" name="report_link"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
