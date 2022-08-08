<!-- 
	입력 폼
	숫자1
	숫자2
	
	연산자 + - * / 선택
	전송
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./calcresult.jsp" method="post">
		<input type="number" name="left" />
		<select name="operator">
			<option value="plus">+</option>
			<option value="minus">-</option>
			<option value="multiply">*</option>
			<option value="divide">/</option>
		</select>
		<input type="number" name="right" />
		<input type="submit" />
	</form>
</body>
</html>