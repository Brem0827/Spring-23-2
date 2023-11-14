<%@page import="daelim.office.library.admin.member.AdminMemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<jsp:include page="../../include/title.jsp" />

<link href="<c:url value='/resources/css/admin/modify_account_form.css' />" rel="stylesheet" type="text/css">

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
		
			<%
			AdminMemberVo loginedAdminMemberVo = (AdminMemberVo) session.getAttribute("loginedAdminMemberVo");
			%>
		
			<div class="modify_account_form">
			
				<form action="<c:url value='/admin/member/modifyAccountConfirm' />" name="modify_account_form" method="post">
					
					<input type="hidden" 	name="a_m_no"		value="<%= loginedAdminMemberVo.getA_m_no() %>">
					
					<input type="text"		name="a_m_id" 		value="<%= loginedAdminMemberVo.getA_m_id() %>" readonly disabled> <br>
					<input type="password"	name="a_m_pw" 		value="******" readonly disabled> <br>
					<input type="text"		name="a_m_name" 	value="<%= loginedAdminMemberVo.getA_m_name() %>" placeholder="이름을 입력 해 주세요"> <br>
					<input type="text"		name="a_m_addr" 	value="<%= loginedAdminMemberVo.getA_m_addr() %>" placeholder="주소를 입력 해 주세요"> <br>
					<select name="a_m_gender">
						<option value="">성별을 선택 해 주세요</option>
						<option value="M" <% if (loginedAdminMemberVo.getA_m_gender().equals("M")) {%> selected <%}%>>남성</option>
						<option value="W" <% if (loginedAdminMemberVo.getA_m_gender().equals("W")) {%> selected <%}%>>여성</option>
					</select> <br>
					<input type="text"		name="a_m_part"		value="<%= loginedAdminMemberVo.getA_m_part() %>" placeholder="관리자 담당 부서 입력" ><br>
					<input type="text"		name="a_m_position"	value="<%= loginedAdminMemberVo.getA_m_position() %>" placeholder="관리자 담당 역할 입력" ><br>
					<input type="email"		name="a_m_mail"		value="<%= loginedAdminMemberVo.getA_m_mail() %>" placeholder="관리자 이메일 입력" ><br>
					<input type="text"		name="a_m_phone"	value="<%= loginedAdminMemberVo.getA_m_phone() %>" placeholder="관리자 연락처 입력"> <br>
					<input type="button"	value="modify account" onclick="modifyAccountForm();"> 
					<input type="reset"		value="reset">
					
				</form>
				
			</div>
		
		</div>
		
	</section>
	
	<jsp:include page="../../include/footer.jsp" />
	
</body>
</html>