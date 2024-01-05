<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<c:forEach items="${member}" var="item">
<div style="    display: flex;
    justify-content: space-between;">
    <div>이름 : ${item.name}</div>
    <div>아이디 : ${item.id} </div>
    <div>전화번호 :${item.phoneNumber} </div>
    <div>이메일 : ${item.email}</div>
    <div>주소 : ${item.address}</div>
</div>
</c:forEach>
<a href="/member/createPage">가자</a>
</body>
</html>