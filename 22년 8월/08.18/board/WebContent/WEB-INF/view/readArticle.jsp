<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="u" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 읽기</title>
</head>
<body>

<table border="1" width="100%">
	<tr>
		<td>번호</td>
		<td>${ articleData.article.number }</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td>${ articleData.article.writer.name }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td><c:out value="${ articleData.article.title }"></c:out></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><u:pre value="${ articleData.content }"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<c:set var="pageNo" value="${ empty param.pageNo ? '1' : param.pageNo }" />
			<a href="list.do?pageNo=${ pageNo }">[목록]</a>
			${ authUser.id }
			${ articleData.article.writer.id }
			<c:if test="${ authUser.id == articleData.article.writer.id }">
				<a href="modify.do?no=${ articleData.article.number }">[게시글수정]</a>
				<a href="delete.do?no=${ articleData.article.number }">[게시글삭제]</a>
			</c:if>
		</td>
	</tr>
</table>
</body>
</html>