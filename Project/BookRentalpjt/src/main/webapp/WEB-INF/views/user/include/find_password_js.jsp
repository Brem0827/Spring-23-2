<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">

	function findPasswordForm() {
		console.log('findPasswordForm() CALLED!!');
		
		let form = document.find_password_form;
		
		if (form.u_m_id.value == '') {
			alert('사용자의 아이디를 입력해주세요');
			form.u_m_id.focus();
			
		} else if (form.u_m_name.value == '') {
			alert('사용자의 이름을 입력해주세요');
			form.u_m_name.focus();
			
		} else if (form.u_m_mail.value == '') {
			alert('사용자의 이메일을 입력해주세요');
			form.u_m_mail.focus();
			
		} else {
			form.submit();
			
		}
		
	}

</script>