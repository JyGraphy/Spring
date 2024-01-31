<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
    

<style>
	table {
		border-collapse: collapse;
		width: 800px;
		margin: 20px auto;
		
	}
	
	
	

</style>


<h3>게시글 수정</h3>
<form method="POST">
	<table>
		<tr>
			<td><input type="text" name="title" placeholder="제목" value="${dto.title }"></td>
		</tr>
		<tr>
			<td><input type="text" name="writer" value="${login.userid }" readonly="readonly"></td>
		</tr>
		<tr>
			<td><textarea name="content" placeholder="내용 작성하기" 
						 style="resize: none; width: 600px; height: 200px;">${dto.content }</textarea></td>
		</tr>
		<c:if test="${login.userid == 'T1top' }">
		<tr>
			<td>
				<label>
					<input type="checkbox" name="isNotice" value="1"
					${dto.isNotice == 1 ? 'checked' : '' }>공지로 등록하기
				</label>
			</td>
		</tr>
		</c:if>
	</table>
	
	<input type="submit" value="수정완료">


</form>




</body>
</html>