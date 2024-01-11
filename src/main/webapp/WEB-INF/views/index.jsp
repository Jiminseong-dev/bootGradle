<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Member Details</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: white;
            padding: 10px;
            text-align: center;
        }

        .member-details {
            width: 80%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .member-details div {
            margin-bottom: 10px;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            text-decoration: none;
            color: white;
            background-color: #007bff;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<header>
    <h1>Member Details</h1>
</header>

<div class="member-details">
    <c:forEach items="${member}" var="item">
        <div>
            <strong>이름:</strong> ${item.name}
        </div>
        <div>
            <strong>아이디:</strong> ${item.id}
        </div>
        <div>
            <strong>전화번호:</strong> ${item.phoneNumber}
        </div>
        <div>
            <strong>이메일:</strong> ${item.email}
        </div>
        <div>
            <strong>주소:</strong> ${item.address}
        </div>
    </c:forEach>
</div>

<a href="/member/createPage">가자</a>
</body>
</html>