<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>회원 목록</title>
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

        /* New styles for member details */
        .member-details strong {
            color: #333;
        }

        .member-details div {
            border-bottom: 1px solid #ccc;
            padding-bottom: 10px;
        }
    </style>
</head>
<body>
<header>
    <h1>회원 목록</h1>
</header>
<a href="/member/createPage">회원가입</a>

<div class="member-details">
    <c:forEach items="${member}" var="item">
        <div>
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
            <strong>주소:</strong> ${item.address}: ${item.detail_address}
        </div>
            <button type="button" class="memberModify" data-index="${item.index}">수정</button>
        </div>
    </c:forEach>
</div>

</body>
</html>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
    $('.memberModify').on('click',function(){
        var index = $(this).data('index');
        location.href="/member/modifyPage/"+index
    })
</script>
