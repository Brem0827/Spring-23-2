<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<jsp:include page="../../include/title.jsp" />

<link href="<c:url value='/resources/css/admin/register_book_form.css' />" rel="stylesheet" type="text/css">

<jsp:include page="../include/register_book_form_js.jsp" />

</head>
<body>

	<jsp:include page="../../include/header.jsp" />
	
	<jsp:include page="../include/nav.jsp" />
	
	<section>
		
		<div id="section_wrap">
		
			<div class="word">
			
				<h3>책 등록 양식</h3>
				
			</div>
		
			<div class="register_book_form">
			
				<form action="<c:url value='/book/admin/registerBookConfirm' />" name="register_book_form" method="post" enctype="multipart/form-data">
					
					<input type="text"		name="b_name" 			placeholder="책의 이름을 입력해주세요"> <br>
					<input type="text"		name="b_author" 		placeholder="책의 저자를 입력해주세요"> <br>
					<input type="text"		name="b_publisher"		placeholder="출판사의 이름을 입력해주세요"> <br>
					<input type="text"		name="b_publish_year" 	placeholder="책의 출판년도를 입력해주세요"> <br>
					<input type="text"		name="b_isbn" 			placeholder="책의 고유번호를 입력해주세요"> <br>
					<input type="text"		name="b_call_number" 	placeholder="책의 도서 정리번호를 입력해주세요"> <br>
					<select name="b_rantal_able">
						<option value="">도서 대출 가능 여부</option>
						<option value="0">불가능</option>
						<option value="1">가능</option>
					</select><br>
					<input type="file"		name="file"><br>
					<input type="button"	value="도서 등록" onclick="registerBookForm();"> 
					<input type="reset"		value="초기화">
					
				</form>
				
			</div>
		
		</div>
		
	</section>
	
	<jsp:include page="../../include/footer.jsp" />
	
</body>
</html>