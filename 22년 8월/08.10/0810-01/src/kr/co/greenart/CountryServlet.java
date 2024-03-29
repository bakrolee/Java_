package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 서블릿의 역할 : 요청 주소에 따른 제어
		
		String continent = req.getParameter("continent");
		CountryDAO dao = new CountryDAO();
		List<Country> list = null;
		try {
			list = dao.getCountryByContinent(continent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("list", list);
		req.setAttribute("continent", continent);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
		
//		req.setAttribute("title", "서블릿에서 설정한 제목");
//		req.setAttribute("message", "서블릿에서 설정한 메시지");
//		req.getRequestDispatcher("messageoutput.jsp").forward(req, resp);
	}
}
