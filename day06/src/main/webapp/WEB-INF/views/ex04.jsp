<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>ex04 - 다중 파일 업로드 (외래키를 사용하지 않음)</h1>
	<hr>
	
	
	<form method="POST" enctype="multipart/form-data">
		<p><input type="file" name="upload" multiple="multiple" required="required"></p>
		<p><input type="text" name="memo" placeholder="내용설명"></p>
		<p><input type="submit" value="업로드"></p>
	</form>
	
	<c:forEach var="dto" items="${list }">
		<fieldset>
			<legend>${dto.memo }</legend>
			<div style="display: flex;">
				<c:forTokens var="fileName" items="${dto.storedFileName }" delims=":">
					<img alt="" src="${cpath}/upload/${fileName}" height="200">
				</c:forTokens>
			</div>
		</fieldset>
	
	</c:forEach>
	
</body>
</html>