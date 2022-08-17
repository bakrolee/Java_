package kr.co.greenart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 서블릿이 요청 객체를 다루기 전
//		System.out.println("doFilter 전!!");
		
		HttpSession session = ((HttpServletRequest) request).getSession();
		Object loginid = session.getAttribute("loginid");
		
		if (loginid != null) {
//			System.out.println("로그인 확인되었습니다. 게시판 목록으로 foward합니다.");
			// 원래 흐름 (서블릿에게 req, resp 객체를 그대로 전달해줌.)
			chain.doFilter(request, response);
		} else {
//			System.out.println("로그인 되지 않은 유저");
			
			((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
		}
		
		// 서블릿이 요청을 처리하고 응답 보내기 전
//		System.out.println("doFilter 후!!");
	}
}






















