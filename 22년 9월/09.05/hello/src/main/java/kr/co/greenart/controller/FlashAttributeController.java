package kr.co.greenart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/flash")
public class FlashAttributeController {
	@GetMapping("/1")
	public String forward(Model model) {
		model.addAttribute("fowardtest", "포워드 테스트");
		return "flashview";
	}
	
	@GetMapping("/2")
	public String view() {
		return "flashview";
	}
	
	@GetMapping("/3")
	public String redirect(Model model) {
		model.addAttribute("redirecttest", "리다이렉트 테스트");
		return "redirect:2";
	}
	
	@GetMapping("/4")
	public String flash(RedirectAttributes ra) {
		ra.addFlashAttribute("redirecttest", "플래시 어트리뷰트의 모델값");
		// addFlashAttribute : 리다이렉트 한번에 대해선 값을 유지함.
		// 스프링에서 해당 값을 세션처럼 유지하게 해주고, (리퀘스트엔 값을 넣으면 redirect시 사라지기때문)
		// 값을 활용하고 난 뒤에는 스프링에서 값을 지워줌.
		return "redirect:2";
	}
}
