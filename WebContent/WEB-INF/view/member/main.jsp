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
			<td>
			<% 
			String dest = String.valueOf(request.getAttribute("dest"));
			if(dest.equals("join-form")){
				%>
				<%@ include file="side-join.jsp"%>
				<% 
			} else{ 
				%>
				<%@ include file="side-menu.jsp" %>
				<%
			}
			%>
			</td>
			<td>
			<%
			dest = String.valueOf((request.getAttribute("dest")));
			switch(dest){
			case "NONE" : 
				%><% 
				break;
			case "join-form" : 
				%><%@ include file="join-form.jsp"%><%
				break;
			case "member-detail": 
				%> <%@ include file="member-detail.jsp"%><%
				break;
			case "member-update": 
				%> <%-- <%@ include file="member-update.jsp"%> --%><%
				break;

			}
			%>
		
			</td>
		</tr>
	</table>
</body>
</html>