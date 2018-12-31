<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 

String name = request.getParameter("name");
String accountNum = "";
Random random = new Random();
for(int i=0; i<14;i++){
	if(i==5){
		accountNum += random.nextInt(10)+"-";
	} else if(i==7){
		accountNum += random.nextInt(10)+"-";
	} else {
		accountNum += random.nextInt(10);
	}
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>신규 계좌</h1><br />
	<h3><%=name %> 님의 신규 계좌입니다.</h3><br />
	<h3>계좌번호 : <%=accountNum %></h3><br />
	
	<h3><a href="">입출금</a></h3>
	<h3><a href="../index.jsp">홈으로</a></h3>

</body>
</html>