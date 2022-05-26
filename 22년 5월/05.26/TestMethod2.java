public class TestMethod2 {
	public static int sum() {  // return type : void (없음)
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum;  // return 없으면 컴파일 에러 뜸.
	}
	
	// pi 메소드 { 3.14 실수값을 반환하는 메소드 }
	public static double pi() {		// 내가 return하고자 하는 타입으로 작성하면 됨.
		return 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = sum();  // 30이라는 값을 가지고 옴. (return 때문)
		System.out.println(result);
		
		double pi = pi();
		System.out.println(pi);
		
		System.out.println("끝");
	}
}