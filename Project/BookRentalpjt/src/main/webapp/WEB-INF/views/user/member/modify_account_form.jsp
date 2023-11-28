<%@page import="com.office.library.user.member.UserMemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<jsp:include page="../../include/title.jsp" />

<link href="<c:url value='/resources/css/user/modify_account_form.css' />" rel="stylesheet" type="text/css">

<jsp:include page="../include/modify_account_form_js.jsp" />

</head>
<body>

	<jsp:include page="../../include/header.jsp" />
	
	<jsp:include page="../include/nav.jsp" />
	
	<section>
		
		<div id="section_wrap">
		
			<div class="word">
			
				<h3>계정 수정</h3>
				
			</div>
		
			<div class="modify_account_form">
			
				<form action="<c:url value='/user/member/modifyAccountConfirm' />" name="modify_account_form" method="post">
					
					<input type="hidden" name="u_m_no" value="${loginedUserMemberVo.u_m_no}">
					
					<input type="text" name="u_m_id" value="${loginedUserMemberVo.u_m_id}" readonly disabled> <br>
					<input type="password" name="u_m_pw" value="******" readonly disabled> <br>
					<input type="text" name="u_m_name" value="${loginedUserMemberVo.u_m_name}" placeholder="사용자의 이름을 입력해주세요"> <br>
					<select name="u_m_gender">
						<option value="">사용자의 성별을 선택해주세요</option>
						<option value="M" <c:if test="${loginedUserMemberVo.u_m_gender eq 'M'}"> selected </c:if>>남성</option>
						<option value="W" <c:if test="${loginedUserMemberVo.u_m_gender eq 'W'}"> selected </c:if>>여성</option>
						
					</select> <br>
					<input type="email"	name="u_m_mail" value="${loginedUserMemberVo.u_m_mail}" placeholder="사용자의 메일을 입력해주세요" ><br>
					<input type="text" name="u_m_phone"	value="${loginedUserMemberVo.u_m_phone}" placeholder="사용자의 전화번호를 입력해주세요"> <br>
					<input type="button" value="계정 수정" onclick="modifyAccountForm();"> 
					<input type="reset" value="초기화">
					
				</form>
				
			</div>
		
		</div>
		
	</section>
	
	<jsp:include page="../../include/footer.jsp" />
	
</body>
</html>