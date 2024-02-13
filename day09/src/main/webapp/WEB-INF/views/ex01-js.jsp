<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
</head>
<body>
		<h1>ex01 - JSON을 자바스크립트로 처리하여 출력하기</h1>
		<hr>
		
		<div id="root"></div>
		
		
		
		<script type="text/javascript">
			const jsonObject = ${json}
			
		// 트리 형태로 내가 원하는 부분을 찾아 표기
		//	console.log(jsonObject.getFestivalKr.item)
		const arr = jsonObject.getFestivalKr.item	
		const root = document.getElementById('root')
		
		root.innerHTML = ''
		for (let i = 0; i < arr.length; i++) {
			let tag = ''
			tag += '<div class="item">'
			tag += '		<div><h3>' + arr[i].UC_SEQ + '. ' + arr[i].TITLE + '(' + arr[i].GUGUN_NM + ')</h3></div>'
			tag += '		<div>' + arr[i].HOMEPAGE_URL + '</div>'
			tag += '		<div><img src="' + arr[i].MAIN_IMG_NORMAL + '" height="300"></div>'
			tag += '		<div>'
			tag += '			<details>'
			tag += '				<summary>상세보기</summary>'
			tag += '				<span>' + arr[i].ITEMCNTNTS + '</span>'
			tag += '			</details>'
			tag += '		</div>'
			tag += '	</div>'
			root.innerHTML += tag
			
		}
		</script>
</body>
</html>