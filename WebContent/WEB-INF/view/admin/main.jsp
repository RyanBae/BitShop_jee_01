<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css" />
</head>
<body>
<%System.out.println(" => 관리자 메인 입장"); %>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<h1>비트 쇼핑몰</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<div class="menubar">
                    <ul>
                        <li><a href="home.do">홈</a></li>
                        <li><a href="member.do" id="current">회원관리</a>
                            </li>
                        <li ><a href="account.do" >계좌관리</a></li>
                            
                        <li><a href="article.do">게시판</a>
                            <ul>
                                <li><a href="article.do">글쓰기</a></li>
                                <li><a href="">게시판 목록</a></li>
                                <li><a href="">게시판 수정</a></li>
                            </ul></li>
                        <li><a href="admin.do"><font color="red">관리자</font></a></li>
                     
                    </ul>
                </div>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td id="side-menu">
			<table>
				<tr>
					<td style="background-color:Gray; "><b>관리 목록</b></td>
				</tr>
				<tr>
					<td>계좌목록</td>
				</tr>
				<tr>
					<td>계좌검색(이름)</td>
				</tr>
			
			</table>
		</td>
		<td></td>
	</tr>
</table>
</body>
</html>