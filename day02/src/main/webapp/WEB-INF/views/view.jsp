<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="detail">
		<div>
			<img src="${cpath }/resources/image/${dto.imgname}" height="300">
		</div>
		<div>
			<h3>${dto.name }</h3>
		</div>
		<div>
			<pre>${dto.memo }</pre>
		</div>
		<div>
			<h4>${dto.price }원</h4>
		</div>

	</div>
	<div class="sb">
		<div>
			<a href="${cpath }/mcdonald"><button>목록</button></a>
		</div>
		<div>
			<a href="${cpath }/mcdonald/modify/${dto.idx}"><button>수정</button></a>
			<a href="${cpath }/mcdonald/delete/${dto.idx}"><button>삭제</button></a>
		</div>
	</div>
</body>
</html>