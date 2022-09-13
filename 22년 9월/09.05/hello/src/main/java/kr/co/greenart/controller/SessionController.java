package kr.co.greenart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping(value = "/session", produces = "text/plain; charset=utf-8")
@ResponseBody
@SessionAttributes("modelname") // 이 값을 계속 session에서 관리하는 게 아님. (범위가 특이함)
							// 해당 컨트롤러 안에서만 사용가능! 다른 컨트롤러에서 사용하려면 없는 것처럼 보임.
public class SessionController {
	@GetMapping("/add")
	public String addSessionValue(HttpSession session) {
		session.setAttribute("myname", "myvalue");
		return "세션에 값 설정";
	}
	
	@GetMapping("/check")
	public String getSessionValue(HttpSession session) {
		return (String) session.getAttribute("myname");
	}
	
	@GetMapping("/model")
	public String addModelValue(Model model) { // Model은 
		model.addAttribute("modelname", "modelvalue");
		return "모델에 값 설정";
	}
	
	@GetMapping("/modelcheck")
	public String getModelValue(Model model) {
		return (String) model.getAttribute("modelname");
	}
	
	@GetMapping("/status")
	public String complete(SessionStatus status) {
		status.setComplete(); //SessionAttribute에서 설정한 값만 사라짐 (model)
							// HttpSession의 값은 안 사라짐! -> 얘는 session.invalidate(); 해야 사라짐
		return "세션 어트리뷰트 삭제되었음";
	}
}






