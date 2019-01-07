<%@page import="domain.AccountBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>

	<%
		AccountBean acc = (AccountBean) request.getAttribute("acc");
		String accountNum = acc.getAccountNum();
		String date = acc.getToday();
		String money = String.valueOf(acc.getMoney());
		/*
			String date = request.getAttribute("date").toString();
			System.out.println(date);
			String money = request.getAttribute("money").toString();
			System.out.println(money);
			String accountNum = request.getAttribute("num").toString();
			System.out.println(accountNum);
			*/
	%>
	<b>계좌가 개설되었습니다.</b><br /> <br /> 날짜 :
	<%=date%>
	<br /> 계좌번호 :
	<%=accountNum%>
	<br /> 잔액 :
	<%=money%><br />
	</div>