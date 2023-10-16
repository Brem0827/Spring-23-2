<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
    <title>view.jsp</title>
</head>
<body>
    <h1>회원정보</h1>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>PASSWORD</td>
            <td>NAME</td>
            <td>NUM1</td>
            <td>NUM2</td>
            <td>EMAIL</td>
            <td>PHONE</td>
            <td>ZIPCODE/ADDRESS</td>
            <td>JOB</td>
        </tr>
    <c:forEach item="${info}" var="contact">
        <tr>
            <td>${member.id}</td>
            <td>${member.pw}</td>
            <td>${member.name}</td>
            <td>${member.num1}</td>
            <td>${member.num2}</td>
            <td>${member.email}</td>
            <td>${member.phone}</td>
            <td>${member.address}</td>
            <td>${member.job}</td>
        </tr>
    </c:forEach>
    </table>
    <h1>total records : ${info.size()}</h1>
</body>
</html>
