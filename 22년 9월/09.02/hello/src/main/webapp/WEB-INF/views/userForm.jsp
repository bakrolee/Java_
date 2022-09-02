<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 정보 입력</title>
</head>
<body>
	<f:form modelAttribute="user" method="post">
		<f:errors path="name"/> <!-- 이름에 대한 에러메세지 보여줄 때 -->
		<f:input type="text" path="name" />
		<f:errors path="age"/>  <!-- path="필드" -->
		<f:input type="number" path="age"/>
		<input type="submit" />
	</f:form>
</body>
</html>