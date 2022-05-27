public class StaticVariableAndConst3 {
	// public static int number = 100;  // 전역 변수
	public static final int NUMBER = 100;  // 전역 변수
	
	public static void test() {
		// number++;
		// System.out.println("테스트 메소드에서: " + number);
		
		System.out.println("테스트 메소드에서: " + NUMBER);
	}
	
	public static void main(String[] args) {
		// number++;;
		// System.out.println("메인 메소드에서: " + number);
		// test();
		
		System.out.println("메인 메소드에서: " + NUMBER);
		test();
		
		System.out.println(Math.PI);  // java에서 만들어 놓은 전역상수 (Math = 클래스 이름, PI = 상수 이름)
		// Math.PI++;  // 상수라 변화 불능
		
		double a = Math.abs(-372);  // java에서 만들어 놓은 메소드 (abs = 메소드 이름)
		System.out.println(a);
		
		double r = Math.random();
		System.out.println(r);
	}
}