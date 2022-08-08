<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./personresult.jsp">
		<input type="text" name="userName" required />
		<input type="number" name="userAge" required />
		<input type="submit" />
	</form>

	<%= request.getParameter("repeat") %>

<!--  
	<
		String repeat = request.getParameter("repeat");
		
		if (repeat.equals("nameage")) {
			out.println("이름, 나이를 모두 입력해주세요.");
		} else if (repeat.equals("name")) {
			out.println("이름을 입력해주세요.");
		} else {
			out.println("나이를 입력해주세요.");
		}
	%>
-->
	
</body>
</html>