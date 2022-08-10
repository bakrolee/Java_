<!-- 주소 요청에 따라 동작하는 페이지 -->

<%@page import="kr.co.greenart.Country"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<% 
	String continent = request.getParameter("continent");
	CountryDAO dao = new CountryDAO();
	List<Country> list = dao.getCountryByContinent(continent);
	
	request.setAttribute("list", list);
	request.setAttribute("continent", continent);
	request.getRequestDispatcher("result.jsp").forward(request, response);
%>