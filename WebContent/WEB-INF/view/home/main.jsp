<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<img src="<%=request.getContextPath() %>/resources/img/happy.jpg" alt="" />
	</div>

	<h1 style="border:2px solid DodgerBlue;"> 메 인 </h1>
	<a href="member/main.jsp">회원관리</a><br /><br />
	<a href="account/main.jsp">계좌관리</a><br /><br />
	<a href="">게시판</a><br /><br />
	<a href="">관리자</a><br /><br />
</body>
</html>