<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=application.getContextPath()%>/resources/css/style.css" />
</head>
<body>
	<%
		System.out.println(" => 맴버 메인 입장");
	%>
	<table id="wrapper">
		<tr>
			<td colspan="2"><%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2"><%@ include file="../home/navi-bar.jsp"%>
			</td>
		</tr>
		<tr style="height: 300px">
			<td><%@ include file="side-menu.jsp"%>
			</td>
			<td></td>
		</tr>
	</table>
</body>
</html>