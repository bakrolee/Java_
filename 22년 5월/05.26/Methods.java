import java.util.*;

public class Methods {
	public static int increase(int a) {  // 파라미터는 박스 하나를 마련해둘께. 여기에 값을 집어넣어줘.
		a++;
		return a;   // 원하는 값을 만들려면 리턴밸류를 만들어 주면 된다.
	}
	
	/* public static int,int createTwoNumber() {
		return 20, 30;   // 리턴 값은 1개만. 
	}
	
	public static boolean test() {  // 고로 헤드에서 어떤 타입의 메소드를 만들건지 잘 정해둬야 함(중요)
		return 10;  //  리턴하고자 하는 타입과 리턴 값의 타입이 일치해야 함.
	} */
	
	
	//숫자 하나가 짝수, 홀수인지 알고 싶음. 이 기능을 할 수 있는 메소드.
	public static char isEven(int i) {
		if (i % 2 == 1) {
			return '홀';
		} else {
			return '짝';
		}
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 10;
		// increase(a);  // Call By Value : 메소드를 호출할 때는 변수를 넣어도 변수값만 복사되어 전달된다. 고로 변화된 값은 메소드 안에서만 존재하게 되어 내가 원하는 값을 낼 수 없다.
		
		System.out.println(increase(a));	// 얘만 하면 a의 값에는 영향 없음.
		System.out.println(a);
		
		a = increase(a);  // 이 대입연산을 하지 않으면 a의 값은 변하지 않는다.
		System.out.println(a);
		
		System.out.print("입력");
		int num = scan.nextInt();
		
		char result = isEven(num);
		System.out.println(result);
		
	}

	
	
}