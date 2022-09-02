package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.resource.HttpResource;

@Controller
@RequestMapping("/mapping")
public class MappingController {
	@GetMapping(value = "/??.two", produces = "text/plain; charset=utf-8")
	public @ResponseBody String two() {
		return "두글자 매핑";
	}
	
	@GetMapping("/*.do")
	public @ResponseBody String doURI() {
		return "do로 끝나는 매핑";
	}
	
	@GetMapping(value = "/ppp", params = "com" ) 
	// params : 파라미터가 필수로 있어야 함. 값 지정할 수도 있음.(com=val) 부정표현도 가능함.(!com)
	public @ResponseBody String ppp(@RequestParam( defaultValue = "default") String com) {
		return com;
	}
}
