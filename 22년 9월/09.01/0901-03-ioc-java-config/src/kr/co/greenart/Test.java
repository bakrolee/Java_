package kr.co.greenart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("component-scan.xml");
		
//		MyDataRepository repo = context.getBean("mylist", MyDataRepository.class);
//		System.out.println(repo.getMyNumbers());
		
//		MyService service = context.getBean(MyService.class);
//		System.out.println(service.numberService());
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		MyService service = context.getBean(MyService.class);
		System.out.println(service.numberService());
	}
}
