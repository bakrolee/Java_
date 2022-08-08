<%
	String choice = request.getParameter("choice");

	if (choice == null || choice.length() == 0) {
		response.sendRedirect("want.jsp?progress=failed");
	} else if (choice.equals("person")) {
		response.sendRedirect("./persons.jsp");
	} else if (choice.equals("fruit")) {
		response.sendRedirect("./fruit.jsp");
	}
%>
