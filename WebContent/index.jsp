<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1 style="border:2px solid DodgerBlue;"> 로 그 인 </h1>
	<div>
		<form action="member.do">
			ID <input type="text" name="id"/><br />
			PASS <input type="text" name="pass"/><br />
			<input type="submit" id="btn" value="login"/>
		</form>
	</div>
</body>
</html>