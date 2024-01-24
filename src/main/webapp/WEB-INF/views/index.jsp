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
            font-family: sans-serif;
            font-size: 16px;
        }

        header {
            background-color: #292929;
            padding: 10px;
            color: white;
        }

        h1 {
            font-size: 24px;
        }

        main {
            margin-top: 20px;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #ccc;
            padding: 10px;
        }

        th {
            text-align: center;
        }

        tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        footer {
            background-color: #292929;
            padding: 10px;
            color: white;
            text-align: center;
        }
    </style>
</head>
<body>
<header>
    <h1>사용자 목록</h1>
</header>
<a href="/member/createPage">회원가입</a>
<main>
    <table>
        <thead>
        <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>이메일</th>
            <th>전화번호</th>
            <th>주소</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${member}" var="item">
            <td>이름:${item.name}</td>
            <td>아이디:${item.id}</td>
            <td>전화번호:${item.phoneNumber}</td>
            <td>이메일:${item.email}</td>
            <td>주소: ${item.address}: ${item.detail_address}</td>
        <td><button type="button" class="memberModify" data-index="${item.seq}">수정</button><button type="button" class="memberDelete" data-index="${item.seq}">삭제</button></td>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <p>&copy; 2023. All rights reserved.</p>
</footer>

</body>
</html>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
    $('.memberModify').on('click',function(){
        var index = $(this).data('index');
        location.href="/member/modifyPage/"+index
    })
    $('.memberDelete').on('click',function(){
        var index = $(this).data('index')
        $.ajax({
            url:"/member/delete/"+index,
            type:"DELETE",
            success:function(){
                location.reload()
            }
        })
    })
</script>
