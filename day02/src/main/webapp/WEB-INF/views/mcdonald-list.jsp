<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="box">
	<c:forEach var="dto" items="${list }">
		<div class="item">
			<div class="img">
				<a href="${cpath }/mcdonald/view/${dto.idx}">
					<img src="${cpath }/resources/image/${dto.imgname}" height="120"></a>
			</div> 
			<div class="name">${dto.name }</div>
			<div class="price">${dto.price }원</div>
		</div>
		</c:forEach>
				
		<div>
		<a href="${cpath }/mcdonald/add"><button>추가</button></a>
		</div>
	</div>
</body>
</html>