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
		String name = request.getParameter("userName");
		String age = request.getParameter("userAge");
		
		if (name.length() == 0 && age.length() == 0) {
			response.sendRedirect("./person.jsp?repeat=nameage");
		} else if (name.length() == 0 || name == null) {
			response.sendRedirect("./person.jsp?repeat=name");
		} else if (age.length() == 0 || age == null) {
			response.sendRedirect("./person.jsp?repeat=age");
		} else {
			out.println("(" + name + "," + age + ")님 환영합니다.");
		}
		
	%>
</body>
</html>