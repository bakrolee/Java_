import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.MyBean;
import mybeans.MyLogic;
import mybeans.MyStatefulObj;

public class IOC_Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		
//		MyBean b = context.getBean(MyBean.class);
//		
//		b.hello();
//		
//		MyBean b2 = (MyBean) context.getBean("first");
//		MyBean b2 = context.getBean("first", MyBean.class);
//		b2.hello();
//		
//		System.out.println(b == b2);
		
//		MyLogic logic = context.getBean(MyLogic.class);
//		logic.someMethod();
		
//		MyStatefulObj third = context.getBean(MyStatefulObj.class);
//		System.out.println(third);
//		third.setName("new-name");
//		third.setNumber(200);
//		
//		MyStatefulObj oneMoretime = context.getBean(MyStatefulObj.class);
//		System.out.println(oneMoretime);
		
		MyStatefulObj fourth = context.getBean("fourth", MyStatefulObj.class);
		System.out.println(fourth);
	}
}
