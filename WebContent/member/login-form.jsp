<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<p>가입하신 ID와 비밀번호를 입력하세요.</p>
	<form action="login-result.jsp">	
	ID <input type="text" name="id"/><br />
	pass <input type="text" name="pass"/><br />
	<input type="submit" id=btn value="login"/>
	</form>

	
	<a href="../index.jsp">홈으로 이동</a> <br />
	<a href="join-form.jsp">회원가입 </a>
</body>
</html>