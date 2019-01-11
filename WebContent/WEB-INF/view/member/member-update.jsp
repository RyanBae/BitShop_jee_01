<%@page import="domain.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MemberBean user = (MemberBean) session.getAttribute("user");
	%>
<div id="member-update">
	<h1>비밀번호 수정</h1>
	
	<table>
		<tr>
			<th>\</th>
			<th>내용
		</tr>

		<tr>
			<td>ID</td>
			<td><%=user.getId()%></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=user.getName()%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
			현재 비밀번호 <input type="text" name="currPass" /> 
			새 비밀번호 <input type="text" name="changePass" />
			</td>
		</tr>
		<tr>
			<td>SSN</td>
			<td><%=user.getSsn()%></td>
		</tr>
	</table>
</div>