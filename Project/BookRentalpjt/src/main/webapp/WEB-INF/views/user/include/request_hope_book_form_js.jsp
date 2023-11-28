<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">

	function requestHopeBookForm() {
		console.log('requestHopeBookForm() CALLED!!');
		
		let form = document.request_hope_book_form;
		
		if (form.hb_name.value == '') {
			alert('희망하는 책의 이름을 적어주세요');
			form.hb_name.focus();
			
		} else if (form.hb_author.value == '') {
			alert('희망하는 저자의 이름을 입력해주세요');
			form.hb_author.focus();
			
		} else {
			form.submit();
			
		}
		
	}

</script>