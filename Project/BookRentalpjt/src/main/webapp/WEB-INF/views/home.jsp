<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
	<link href="<c:url value='/resources/css/user/userhome.css' />" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="usermain">
		<h1 class="userhome-Title">사용자 메인 화면 입니다.</h1>
		<a class="admin" href="<c:url value='/admin' />">관리자 메인 화면으로 가기</a>
	</div>
</body>
</html>
