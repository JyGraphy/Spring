<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	#root{
		width: 900px;
		margin: 20px auto;
	}
	.item {
		width: 900px;
		margin: 10px auto;
		border:  1px solid grey;
		padding: 10px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>ex01</h1>
	<hr>
	
	<p>
		<a href="${cpath }/ex01/js"><button>JS로 처리하기</button></a>
	</p>
	
	
	<div id="root">
		<c:forEach var="dto" items="${list }">
			<div class="item">
				<div><h3>${dto.UC_SEQ }. ${dto.TITLE } (${dto.GUGUN_NM })</h3> </div>
				<div>${dto.HOMEPAGE_URL }</div>
				<div><img src="${dto.MAIN_IMG_NORMAL }" height="300"></div>
				<div>
					<details>
						<summary>상세보기</summary>
						<span>${dto.ITEMCNTNTS }</span>
					</details>
				
				</div>
			</div>
		
		</c:forEach>
	</div>
	
</body>
</html>