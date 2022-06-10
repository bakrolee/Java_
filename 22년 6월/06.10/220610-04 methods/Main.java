// Method Overloading
// : 다양한 타입들에 대응하는 메소드 

// system.out.print() -> 파라미터 타입이 어떻게 다양하게 대응할 수 있는가?

public class Main {
	public static void someMethod(int param) {
		
	}
	
	public static void sum(int a, int b) { // 파라미터 정수만 받을 수 있음.
		System.out.println(a + b);
	}
	
//	public static void sum(int alisenf, int b) {}  얘는 위에 것과 중복된다고 판단. 
	
	public static void sum(double a, double b) { // 파라미터 정수만 받을 수 있음.
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		sum(10.0, 40.0);
	}
}
