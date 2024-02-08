<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
		<p>
			<input type="number" name="n1" min="0" max="100" required="required" autofocus="autofocus">
			<select name="operator">
			<!--  value 값이 없으면 +가 value값으로 전달 -->
				<option value="">=== 연산자 선택 ===</option>
				<option value="PLUS">+</option>
				<option value="MINUS">-</option>
				<option value="MULTI">*</option>
				<option value="DIVIDE">/</option>
			</select>
			<input type="number" name="n2" min="0" max="120" required="required">
			<input type="submit" value="=">
			
		</p>
	
	</form>
</body>
</html>