<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/11
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" border="1" cellspacing="0">

    <tr>
        <td>id</td>
        <td>name</td>
        <td>qq</td>
        <td>curricular</td>
        <td>college</td>
        <td>report_link</td>
        <td>add</td>
        <td>delete</td>


    </tr>
    <c:forEach items="${ok}" var="Student">
        <tr>
            <td>${Student.id}</td>
            <td>${Student.name}</td>
            <td>${Student.qq}</td>
            <td>${Student.curricular}</td>
            <td>${Student.college}</td>
            <td>${Student.report_link}</td>
            <td><a href="/update/${Student.id}">修改</a></td>
            <td><a href="/delete/${Student.id}">删除</a></td>
        </tr>
    </c:forEach>

    <tr>

        <td><a href="/last/${page}">上一页</a></td>


        <td>
            <form action="/turn/">

                <input type="text" size=4 name="page" value="${page}"/>

                <input type="submit" size=5 value="跳转"/>
            </form>
        </td>


        <td><a href="/next/${page}">下一页</a></td>
        <td>共有"${max}页"</td>

        <td><a href="/increase">增加</a></td>
    </tr>


</table>
</body>
</html>
