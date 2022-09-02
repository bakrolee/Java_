package kr.co.greenart.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.greenart.model.User;
import kr.co.greenart.model.UserService;
import kr.co.greenart.model.UserValidator;

@Controller
public class UserController {
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);
	
//	@Autowired
//	private UserValidator validator; // 라이브러리 쓰면 얘 필요없음.
	
//	@GetMapping("/user")
//	public String userForm(Model model) {
//		model.addAttribute("user", new User("기본값", 1));
//		return "userForm";
//	}
	
	// 위의 작업을 간략하게 해줌. -> 파라미터에 넣어주기면 하면 됨.
	@ModelAttribute("user")
	public User user() {
		return new User("기본값", 1);
	}
	
	@GetMapping("/user")
	public String userForm(@ModelAttribute("user") User user) {
		return "userForm";
	}
	
	
	// 기존 방법
//	@PostMapping("/user")
//	public String submit(@RequestParam String name, @RequestParam int age) {
//		User user = new User(name, age);
//		
//		logger.info("입력정보: " + user.toString());
//		
//		return "redirect:/";
//	}
	
	// 객체로 파라미터 가져오기 : 필드값을 자동으로 집어넣어줌.
	@PostMapping("/user")
	public String submit(@ModelAttribute("user") @Valid User user, BindingResult errors) {
		logger.info("입력정보: " + user.toString());
		
//		validator.validate(user, errors); 
		
		if (errors.hasErrors()) {
			return "userForm";
		}
		service.add(user);
		
		return "redirect:/user/list";
	}
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user/list")
	public String list(Model model) {
		model.addAttribute("list", service.list());
		return "userlist";
	}
	
	
}
