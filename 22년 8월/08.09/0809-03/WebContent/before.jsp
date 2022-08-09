<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<String> continentList = new ArrayList<>();
		
	if (request.getParameter("continent") == null) {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			pstmt = conn.prepareStatement("SELECT DISTINCT continent FROM country");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String continent = rs.getString("continent");
				continentList.add(continent);
			}		
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	
		request.setAttribute("continents", continentList);
		request.getRequestDispatcher("searchform.jsp").forward(request, response);
	} else {
		String continent = request.getParameter("continent");
		Map<String, Integer> map = new LinkedHashMap<>();
		// out.println(continent);
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			pstmt = conn.prepareStatement("SELECT name, population FROM country WHERE continent = ? ORDER BY population");
			pstmt.setString(1, continent);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("name");
				int population = rs.getInt("population");
				map.put(name, population);
			}		
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		
		request.setAttribute("countries", map);
		request.getRequestDispatcher("searchresult.jsp").forward(request, response);
	}
%>


