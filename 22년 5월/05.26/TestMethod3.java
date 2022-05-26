public class TestMethod3 {
	public static int getSum(int a, int b) {  // parameters : 메소드의 입력 부분
											  // 개수, 타입, 순서가 중요.
		return a + b;
	}
	
	// 두 개 int 정수를 전달받아 곱연산결과를 반환하는 메소드 작성하고 호출
	public static int getMul(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		int sum = getSum(30, 60);
		System.out.println(sum);
		
		// System.out.println(a);  지역변수라 컴파일 에러
		
		System.out.println(getSum(100, 200));
		
		System.out.println(getMul(3, 15));
	}
}