<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Map<String, Integer> map = (LinkedHashMap<String, Integer>) request.getAttribute("countries"); %>
		
	<ul>
	<% for (Map.Entry<String, Integer> entry : map.entrySet()) { %>
		<li><%= entry.getKey() + " : " + entry.getValue() %></li> 
	<% } %>
	</ul> 
</body>
</html>