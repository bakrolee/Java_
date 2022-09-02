package kr.co.greenart;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/returns")
public class ReturnTypesController {
	@GetMapping("/viewname")
	public String viewname() {
		return "hello";
	}
	
	@GetMapping("/respbody")
	@ResponseBody
	public String body() {
		return "body 내용";
	}

	@GetMapping("mv")
	public ModelAndView mv(ModelAndView mv) {
//		ModelAndView mv = new ModelAndView();  // 파라미터로 받거나, 생성하거나 자유
		mv.addObject("result", "모델앤뷰 객체로 설정");
		mv.setViewName("plusresult");
		return mv;
	}
	
	@GetMapping("/respentity")
	public ResponseEntity<String> entity() {  // 제네릭은 body 타입
		// 방법1. with 생성자 
//		String body = "바디 내용입니다.";
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-Type", "text/plain; charset=utf-8");
//		ResponseEntity<String> en = new ResponseEntity<>(body, headers, HttpStatus.OK); // 파라미터,생성 중 자유
//		return en;
		
		// 방법2.
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_TYPE, "text/plain; charset=utf-8")
				.body("바디내용 입니다");
	}
	
	@GetMapping("/red")
	public String redirect() {
		return "redirect:/";	// 이렇게 하면 컨텍스트 루트로 감.
	}
}












