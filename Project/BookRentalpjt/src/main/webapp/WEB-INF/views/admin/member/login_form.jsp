<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<jsp:include page="../../include/title.jsp" />

<link href="<c:url value='/resources/css/admin/login_form.css' />" rel="stylesheet" type="text/css">

<jsp:include page="../include/login_js.jsp" />

</head>
<body>

	<jsp:include page="../../include/header.jsp" />
	
	<jsp:include page="../include/nav.jsp" />
	
	<section>
		
		<div id="section_wrap">
			
			<div class="word">
			
				<h3>로그인</h3>
				
			</div>
			
			<div class="login_form">
			
				<form action="<c:url value='/admin/member/loginConfirm' />" name="login_form" method="post">
					
					<input type="text"		name="a_m_id" 		placeholder="관리자 아이디를 입력해주세요"> <br>
					<input type="password"	name="a_m_pw" 		placeholder="관리자 비밀번호를 입력해주세요"> <br>
					<input type="button"	value="로그인" onclick="loginForm();"> 
					<input type="reset"		value="초기화">
					
				</form>
				
			</div>
			
			<div class="find_password_create_account">
				
				<a href="<c:url value='/admin/member/findPasswordForm' />">비밀번호 찾기</a>
				<a href="<c:url value='/admin/member/createAccountForm' />">계정 생성</a>
				
			</div>
		
		</div>
		
	</section>
	
	<jsp:include page="../../include/footer.jsp" />
	
</body>
</html>