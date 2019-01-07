<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../home/head.jsp"%>
<body>
	<%
		System.out.println(" => 계좌 메인 입장");
	String dest = request.getAttribute("dest").toString();
	System.out.println("dest:::"+dest);
	%>

	<table id="wrapper">
		<tr>
			<td colspan="2"><%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2"><%@ include file="navi-bar.jsp"%>
			</td>
		</tr>
		<tr style="height: 300px">
			<td style="width: 30%"><%@ include file="side-menu.jsp"%>
			</td>
			<td>
				<%
				
				
				switch(dest){
				case "open-form" : 
					%><%@ include file="open-form.jsp"%><%
					break;
				case "open-result":
					%><%@ include file="open-result.jsp"%><%
					break;
				}
				
				%>
					

			
			</td>
		</tr>
		<tr style="height: 100px;">
			<td colspan="2"><%@ include file="../home/footer.jsp"%>


			</td>
		</tr>
	</table>
</body>
</html>