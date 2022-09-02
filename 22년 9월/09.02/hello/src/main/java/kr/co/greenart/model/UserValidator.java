package kr.co.greenart.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {  // 객체 타입에 대한 유효성 체크
		return User.class.equals(clazz);  
	}

	@Override
	public void validate(Object target, Errors errors) { // 객체 필드 유효성 체크
		// 문자열에 대해서는 공백 체크 가능 (아예 공백 or 스페이스로만 있을때)
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "이름을 입력하세요");
		
		User user = (User) target;
		if (user.getName().length() > 5) {
			errors.rejectValue("name", "name.toolong", "이름이 너무 깁니다");
		}
		if (user.getAge() > 200) {
			errors.rejectValue("age", "age.tooold", "나이 범위를 초과했습니다");
		}
	}
}
