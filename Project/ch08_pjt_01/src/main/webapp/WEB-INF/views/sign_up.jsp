<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign_up.jsp 파일</title>
</head>
<body>

	 <h3>This page is SIGN_UP</h3>
	 
	 <form action="/hello/signupConfirm">
	 	ID : <input type="text" name="m_id"> <br />
	 	PW : <input type="password" name="m_pw"> <br />
	 	MAIL : <input type="text" name="m_mail"> <br />
	 	PHONE : <input type="text" name="m_phone"> <br />
	 	<input type="submit" name="SIGN_UP">
	 	<input type="reset" name="CANCEL">
	 </form>

</body>
</html>