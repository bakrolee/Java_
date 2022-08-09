<%
	int result = 1 + 1;	
	// 1번 방법
// 	response.sendRedirect("./viewPage.jsp?result=" + result);

	// 2번 방법
// 	application.setAttribute("result", result);
// 	response.sendRedirect("./viewPage.jsp");	

	// 3번 방법 (실패... 이유 = 요청이 2번 일어나기 때문에 1번째에서 사라져버림.)
//  request.setAttribute("result", result);
// 	response.sendRedirect("./viewPage.jsp");	
	
	// 4번 방법
	request.setAttribute("result", result);
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp").forward(request, response);
%>