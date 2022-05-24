public class LoopFor1 {
	public static void main(String[] args) {
		// "반복"이라는 문자열 5번 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("반복");
		}
		// System.out.println(i);  // 컴파일 에러 : i가 for문 내에서의 지역변수라 바깥사용x
		
		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 21부터 30까지 3의 배수 출력
		for (int i = 21; i <= 30; i += 3) {
			System.out.println(i);
		}
		
		// 30 29 28 ... 20까지 역순 출력
		for (int i = 30; i >= 20; i--) {
			System.out.println(i);
		}
	}
}

