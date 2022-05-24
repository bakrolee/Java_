// 범위와 지역변수의 특징
// 이를 통해 프로그램 만들 때 제어문 작성에 쉽게 접근 가능


public class BlockScope {
	public static void main(String[] args) {
		int a = 10;   // a = 지역변수 (중괄호 안에서만 사용하는 변수)
		{
			int b = 20;   // b = 지역변수
			
			// int a = 99;   // 컴파일 에러  (이유 : 큰 범위에 이미 a 있음)
			System.out.println("가능한가?");
			System.out.println(a);
			System.out.println(b);
		}
		// System.out.println(b);  // 컴파일 에러!  (이유 : b는 작은범위를 벗어나면 사라짐)
	}
}