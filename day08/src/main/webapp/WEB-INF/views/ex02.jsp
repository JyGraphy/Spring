<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>ex02 - 성인 / 미성년자 판별</h1>
		
		<form method="POST">
			<p><input type="text" name="name" placeholder="이름" autofocus="autofocus"></p>
			<p><input type="number" name="age" placeholder="나이" ></p>
			<p><input type="submit" ></p>
		
		</form>
</body>
</html>