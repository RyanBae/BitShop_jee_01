<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="domain.MemberBean"%>
<div id="welcome">
<%
	System.out.println("월컴에 들어옴.");
	MemberBean user = (MemberBean)request.getAttribute("member");
	String name = String.format(user.getId());
	System.out.println("이름은?" + name);
	
		%>
		 <%=user.getName() %> 님 환영합니다. 
		<a href="member.do?cmd=logout">로그아웃</a>
		<%
		
%>
</div>