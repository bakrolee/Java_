package kr.co.greenart;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// "/print" GET 요청 -> text 입력 가능 (view)form.jsp으로 foward
// form.jsp submit시 "/print" POST 요청 -> 입력한 text 그대로 를 볼 수 있는 (view)print.jsp로 foward

@Controller
@RequestMapping("/print")
public class PrintController {
	@GetMapping
	public String form() {
		return "form";
	}
	
	@PostMapping
	public String print(HttpServletRequest req, Model model) {
		model.addAttribute("text", req.getParameter("freetext"));
		
		return "print";
	}
	
	@GetMapping("/sub")
	public @ResponseBody String sub() {
		return "/print/sub";
	}
}
