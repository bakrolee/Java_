public class TestMethod {
	public static void printRepeat() {  // 메소드 머리 (head)
										// 얘는 이름만 붙여놓은 것. 호출 전에는 프로그램에 영향을 주지 않음.
		// 메소드 몸통 (body)
		for (int i = 0; i < 3; i++) {
			System.out.println("반복중");
		};
	}
	
	public static void printHello() {
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
		
	}
	
	// 메인!
	public static void main(String[] args) {  // 언제나 프로그램 시작은 메인 메소드에서만 시작!
		System.out.println("프로그램 시작~");
		// printRepeat();  	// 메소드 호출
		
		// for (int i = 0; i < 2; i++) {
			// printRepeat();
		// }
		
		printHello();
		// System.out.println("헬로안에서 초기화한 변수 값: " + number);  // number는 지역변수라 컴파일 에러뜸.
		
		System.out.println("프로그램 끝");
	}
}