<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
<style type="text/css">
	header, section {
		width:  900px;
		margin: auto;
		
	}
</style>

</head>
<body>
<header style="width: 900px; margin: auto;" >
	<h1><a href="${cpath }">day04</a></h1>
	<div id="login" style="height: 60px; text-align: right;">
		<c:if test="${not empty login }">
		<p>
			${login.username } 님 로그인 중
			<a href="${cpath }/member/logout"><button>로그아웃</button></a>
		</p>
		</c:if>
	</div>
	<nav>
		<ul style="display: flex; padding: 0; list-style: none; justify-content: space-around;">
			<li><a href="${cpath }/member/list">회원 목록</a></li>
			<li><a href="${cpath }/member/login">로그인</a></li>
			<li><a href="${cpath }/board/list">게시판</a></li>
		</ul>
	
	</nav>
</header>
	
	
	
	
	
	
	
</body>
</html>