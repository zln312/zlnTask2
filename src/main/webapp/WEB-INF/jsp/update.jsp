<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/12
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/students" method="POST"  >
    <input type="hidden" name="_method" value="PUT">
    <input type="hidden" name="id" value="${student.id}"/>
    名字<input type="text" name="name" value="${student.name}"/>
    QQ<input type="text" name="qq" value="${student.qq}"/>
    修真类型<input type="text" name="curricular" value="${student.curricular}"/>
    毕业院校<input type="text" name="college" value="${student.college}"/>
    日报链接<input type="text" name="report_link" value="${student.report_link}"/>
    <input type="submit" value="提交" />
</form>

</body>
</html>
