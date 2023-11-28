<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">

	function modifyAccountForm() {
		console.log('modifyAccountForm() CALLED!!');
		
		let form = document.modify_account_form;
		
		if (form.u_m_name.value == '') {
			alert('사용자의 이름을 입력해주세요');
			form.u_m_name.focus();
			
		} else if (form.u_m_gender.value == '') {
			alert('사용자의 성별을 선택해주세요');
			form.u_m_gender.focus();
			
		} else if (form.u_m_mail.value == '') {
			alert('사용자의 이메일을 입력해주세요');
			form.u_m_mail.focus();
			
		} else if (form.u_m_phone.value == '') {
			alert('사용자의 전화번호를 입력해주세요');
			form.u_m_phone.focus();
			
		} else {
			form.submit();
			
		}
		
	}

</script>