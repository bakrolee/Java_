package kr.co.greenart;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorhandle")
public class ErrorHandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> e = request.getAttributeNames();
		// names : 모든 어트리뷰트 이름을 다 반환해줌.
		// Enumeration : iterator와 비슷한 객체. 있으면 보여주고 있으면 보여주고...
		while (e.hasMoreElements()) {
			String name = e.nextElement();
			System.out.println(name + " : ");
			System.out.println(request.getAttribute(name));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
