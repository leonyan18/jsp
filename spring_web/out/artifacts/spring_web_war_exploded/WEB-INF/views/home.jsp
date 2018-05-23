<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html;
charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>spittr.Spitter</title>
    <link rel="stylesheet"
    type="text/css"
    href="/resource/layui/css/layui.css" >
</head>
<body>
<script src="/resource/layui/layui.all.js"></script>
<h1>Welcome to spittr.Spitter</h1>
<a href="<c:url value="/spittles" />">Spittles</a> |
<%--<a href="<c:url value="/spitter/register" />">Register</a>--%>
<table class="layui-table" lay-data="{height:315, url:'/json'}" id="demo">
</table>
<script>
    var table = layui.table;
    //第一个实例
    table.render({
        elem: '#demo'
        ,height: 315
        ,url: '/json' //数据接口
        ,page: true //开启分页
        ,cols: [[ //表头
            {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
            ,{field: 'username', title: '用户名', width:80}
        ]]
    });
</script>
<br>
<button class="layui-btn layui-anim-fadeout">确认</button>
</body>
</html>