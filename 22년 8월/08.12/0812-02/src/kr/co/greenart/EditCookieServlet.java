package kr.co.greenart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editcookie")
public class EditCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿠키 편집
		Cookie c = new Cookie("yourname", "edit");
		response.addCookie(c);
		
		// 쿠키 삭제
		Cookie c2 = new Cookie("korname", "");
		c2.setMaxAge(0); // 0이면 삭제, 그 외의 경우에는 만료 기간을 설정할 수 있음 (초단위)
		
		
		response.addCookie(c2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
