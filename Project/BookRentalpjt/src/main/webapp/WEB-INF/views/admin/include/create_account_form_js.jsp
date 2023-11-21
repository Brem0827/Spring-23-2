<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">

	function createAccountForm() {
		console.log('createAccountForm() CALLED!!');
		
		let form = document.create_account_form;
		
		if (form.a_m_id.value == '') {
			alert('관리자 아이디를 입력해주세요');
			form.a_m_id.focus();
			
		} else if (form.a_m_pw.value == '') {
			alert('관리자 비밀번호를 입력해주세요');
			form.a_m_pw.focus();
			
		} else if (form.a_m_pw_again.value == '') {
			alert('관리자 비밀번호를 다시 입력해주세요');
			form.a_m_pw_again.focus();
			
		} else if (form.a_m_pw.value != form.a_m_pw_again.value) {
			alert('관리자 비밀번호를 확인해주세요');
			form.a_m_pw.focus();
			
		} else if (form.a_m_name.value == '') {
			alert('관리자 이름을 입력해주세요');
			form.a_m_name.focus();
			
		} else if (form.a_m_gender.value == '') {
			alert('관리자 성별을 선택해주세요');
			form.a_m_gender.focus();
			
		} else if (form.a_m_part.value == '') {
			alert('관리자 부서를 입력해주세요');
			form.a_m_part.focus();
			
		} else if (form.a_m_position.value == '') {
			alert('관리자 역할을 입력해주세요');
			form.a_m_position.focus();
			
		} else if (form.a_m_mail.value == '') {
			alert('관리자 이메일을 입력해주세요');
			form.a_m_mail.focus();
			
		} else if (form.a_m_phone.value == '') {
			alert('관리자 전화번호를 입력해주세요');
			form.a_m_phone.focus();
			
		} else {
			form.submit();
			
		}
		
	}

</script>