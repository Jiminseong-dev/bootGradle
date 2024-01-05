<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
     <form action="/member/create" method="post">
         <input name="id" placeholder="id">
         <input name="name" placeholder="name">
         <input name="phoneNumber" placeholder="phoneNumber">
         <input name="address" placeholder="address">
         <input name="email" placeholder="email">
    <button type="submit">등록</button>
     </form>

</body>
</html>