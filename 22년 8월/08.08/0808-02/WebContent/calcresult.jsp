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
		int left = Integer.parseInt(request.getParameter("left"));
		int right = Integer.parseInt(request.getParameter("right"));
		String calc = request.getParameter("operator");
		
		if (calc.equals("plus")) {
			out.println(left + right);	
		} else if (calc.equals("minus")) {
			out.println(left - right);	
		} else if (calc.equals("multiply")) {
			out.println(left * right);
		} else if (calc.equals("divide")) {
			out.println((double) left / right);
		} 
	%>
</body>
</html>