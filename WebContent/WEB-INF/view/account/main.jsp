<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../home/head.jsp"%>
<body>
	<%
		System.out.println(" => 계좌 메인 입장");
	%>
	<table id="wrapper">
		<tr>
			<td colspan="2"><%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2"><%@ include file="../account/navi-bar.jsp"%>
				
			</td>
		</tr>
		<tr style="height: 300px">
			<td style="width: 30%"><%@ include file="../account/side-menu.jsp"%>
				
			</td>
			
			<td colspan="2"><%@ include file="../account/open-form.jsp"%>
			
		</tr>
	</table>
</body>
</html>