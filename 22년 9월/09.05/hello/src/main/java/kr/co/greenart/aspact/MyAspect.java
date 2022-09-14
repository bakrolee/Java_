package kr.co.greenart.aspact;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);
//	@Before("execution(* kr.co.greenart.file.FileDBRepository.getAllnames(..))")
//	//execution : 괄호 안의 메소드 실행 시점
//	public void printBefore() {
//		logger.info("-- 파일 목록을 불러오기 전에 실행됩니다. --");
//	}
//	@After("execution(* kr.co.greenart.file.FileDBRepository.getAllnames(..))")
//	public void printAfter() {
//		logger.info("-- 파일 목록을 불러오기 전에 실행됩니다. --");
//	}
	
	// 포인트컷 작성 문법 : 접근제한자 리턴타입 패키지.클래스.메소드(파라미터) 순서 작성
	@Pointcut("execution(* kr.co.greenart.file.FileDBRepository.getAllnames(..))") 
	// execution : 괄호 안의 메소드 실행시
	public void print() {}
	
	@Before("print()")
	public void printBefore() {
		logger.info("-- 파일 목록을 불러오기 전에 실행됩니다. --");
	}
	
	
	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	//within : 어노테이션이 붙은 모든 클래스의 모든 메소드 실행시
	public void repository() {}
	
	@Around("repository()")  // 실행 전,후 조작할 때
	public Object loggingTime(ProceedingJoinPoint jp) throws Throwable {
		long start = System.nanoTime();
		logger.info("시작 시간 : " + start);
		// 위에 쓰면 전
		Object proceed = jp.proceed(); // 실제 실행
		// 아래에 쓰면 후
		long end = System.nanoTime();
		logger.info("종료 시간 : " + end);
		
		logger.info(jp.getSignature().getName() + "메소드의 실행시간 : " + (end - start));
		return proceed;
	}
}















