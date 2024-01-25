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
		<script type="text/javascript">
			const message = '${message}'
			const url = '${url}'
			const cpath = '${cpath}'
			
			if (message == '삭제') {
				alert(message)
				location.href = cpath + url
			}
			else {
				alert(message)
				history.go(-1)
			}
		</script>
</body>
</html>