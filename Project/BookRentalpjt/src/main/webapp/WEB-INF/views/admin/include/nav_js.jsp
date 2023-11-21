<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">

	function searchBookForm() {
		console.log('searchBookForm() CALLED!!');
		
		let form = document.search_book_form;
		
		if (form.b_name.value == '') {
			alert('찾으려는 책의 이름을 입력 해 주세요');
			form.b_name.focus();
			
		} else {
			form.submit();
			
		}
		
	}

</script>