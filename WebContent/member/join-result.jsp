<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String ssn = request.getParameter("ssn");
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	String year = "";
	String month = "";
	String day = "";
	String gender = "";
	String bmi = "";

	year = ssn.substring(0, 2);
	month = ssn.substring(2, 4);
	day = ssn.substring(4, 6);
	

	char check = ssn.charAt(7);
	switch (check) {
	case '1': case '3':
		gender = "남자";
		break;
	case '2': case '4':
		gender = "여자";
		break;
	case '5': case '6':
		gender = "외국인";
		break;
	default:
		gender = "잘못된 주민번호입니다.";
	}
	double hi = Double.parseDouble(height);
	double wi = Double.parseDouble(weight);
	double res = wi/((hi*hi)/10000);
	if(res>=40){
		bmi = "고도비만";
	} else if(res>=35){
		bmi = "중등도 비만";
	} else if(res>=30){
		bmi = "경도비만";
	} else if(res>=25){
		bmi = "과체중";
	} else if(res>=18.5){
		bmi = "정상";
	}else{
		bmi = "저체중";
	}
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>
		가입한 ID:<%=id%></h3><br />
	<h3>이름:<%=name%></h3><br />
	<h3>가입한 비번: ********</h3>	<br />
	<h3>생년월일:	<%=year%>	년	<%=month%>	월	<%=day%>	일</h3>	<br />
	<h3>성 별: <%=gender%></h3><br />
	<h3>BMI: <%=bmi%></h3><br />
	<h3><a href="login-form.jsp">로그인 하러가기</a></h3>
	<h3><a href="../index.jsp">홈으로 이동</a></h3>
</body>
</html>