<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Modification Page</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            background-color: #4caf50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }
        .flex {
            display: flex;
        }
    </style>
</head>
<body>
<form action="/member/update" method="post">
    <input type="hidden" name="id" value="">
    <input name="name" placeholder="이름" autocomplete="off" value="${modifyMemberInfo.name}">
    <input name="phoneNumber" placeholder="전화번호" autocomplete="off" value="${modifyMemberInfo.phoneNumber}">
    <div>
        <div class="flex">
            <input type="text" id="sample6_postcode" name="postcode" placeholder="우편번호" value="${modifyMemberInfo.postcode}">
            <input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
        </div>
        <div class="flex">
            <input type="text" id="sample6_address" name="address" placeholder="주소" value="${modifyMemberInfo.address}"><br>
            <input type="text" id="sample6_detailAddress" name="detail_address" placeholder="상세주소" value="${modifyMemberInfo.detail_address}">
        </div>
    </div>
    <input name="email" placeholder="이메일" autocomplete="off" value="${modifyMemberInfo.email}">
    <button type="submit" data-index="${modifyMemberInfo.index}">회원 정보 수정</button>
</form>
</body>
</html>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        // 주소 검색 로직은 이전 페이지와 동일하게 사용할 수 있습니다.
        // ...
    }
</script>