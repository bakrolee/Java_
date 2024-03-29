package kr.co.greenart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MyInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("--- 1. 핸들러가 처리 전 ---");
		
		HttpSession session = request.getSession(false);  
		// session에 대한 처리를 핸들러에서 그때마다 계속 하게 되는 건 비효율적. 그래서 얘를 통해 관리.
		if (session != null) {
			session.removeAttribute("burn");
		}
		request.setAttribute("burn", "요청 객체에 새로운 어트리뷰트 생성");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 요청을 처리한 후. 뷰가 만들어지기 전
		logger.info("--- 3. 핸들러가 처리 후, 뷰 생성 전 ---");
		
		String value = (String) request.getAttribute("burn");
		value += ". 핸들러 처리 후 어트리뷰트 변경";
		request.setAttribute("burn", value);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 뷰가 만들어진 후
		logger.info("--- 5. 뷰 생성 후 ---");
		
		HttpSession session = request.getSession(false);
		session.removeAttribute("burn");
	}
}
