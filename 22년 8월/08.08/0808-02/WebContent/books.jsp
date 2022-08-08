<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%!
	public List<String> selectedBooks(List<String> list, int num) {
		int end = (num * 10);
		int start = end - 10;
		List<String> list2 = new ArrayList<>();
		for (int i = start; i < end; i++) {
			list2.add(list.get(i));
		}
		return list2;
	}
%>
<%
	List<String> list = new ArrayList<>();
	for (int i = 0; i < 100; i++) {
		list.add("book" + i);
	}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int pageNum = Integer.parseInt(request.getParameter("page"));
	
		List<String> list2 = selectedBooks(list, pageNum);
		for (int i = 0; i < list2.size(); i++) {
			out.println(list2.get(i));
			out.println("<br/>");
		}
	%>
</body>
</html>