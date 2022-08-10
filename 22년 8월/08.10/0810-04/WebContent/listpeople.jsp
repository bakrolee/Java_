<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사람 목록</title>
</head>
<body>
	<h1>사람 목록</h1>
	<ol>
		<c:forEach var="peolist" items="${ list }">
			<li>이름 : ${ peolist.name }, 나이: ${ peolist.age }, email: ${ peolist.email }</li>
		</c:forEach>
	</ol>
</body>
</html>