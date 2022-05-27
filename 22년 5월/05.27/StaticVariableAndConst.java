public class StaticVariableAndConst {
	public static void main(String[] args) {
		int i = 10;
		i++;						// 변수는 이러한 수식에 의해 값 변할 수 있음.
		
		// 상수
		final int MY_NUMBER = 22;   // 변수가 값이 변하지 않도록 설정.
		// MY_NUMBER++;  			// 상수는 값을 변화시키려고 하면 compile error 발생.
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI); // 원넓이
		
		final int ASDF;
		ASDF = 10;
		// ASDF = 15;  // 컴파일 에러
	}
}