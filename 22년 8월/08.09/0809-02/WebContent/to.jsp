<%@page import="java.util.Random"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%
	String alphabet = request.getParameter("alphabet");
	
	if (alphabet == null) {
		response.setStatus(response.SC_BAD_REQUEST);
	}
	
	if (alphabet.equals("a")) {
		request.setAttribute("result", LocalTime.now());
		request.getRequestDispatcher("/WEB-INF/A.jsp").forward(request, response);
	} else if (alphabet.equals("b")) {
		request.setAttribute("result", LocalDate.now());
		request.getRequestDispatcher("/WEB-INF/B.jsp").forward(request, response);
	} else if (alphabet.equals("c")) {
		Random r = new Random();
		request.setAttribute("result", r.nextInt(100));
		request.getRequestDispatcher("/WEB-INF/C.jsp").forward(request, response);
	} 
%>