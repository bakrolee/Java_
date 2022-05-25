// 이중 반복문 응용

// 구구단
// 2단부터 9단까지

public class Gugudan2 {
	public static void main(String[] args) {
		// 2단
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", 2, i, 2 * i);
		}
		// 3단
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", 3, i, 3 * i);
		}
		// 4단
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", 4, i, 4 * i);
		}
		// 5단
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", 5, i, 5 * i);
		}
		
		
		// 이렇게 규칙성을 띄는 모습을 보면 2, 3, 4, 5 만 바꿔주면 되는게 보임
		// 이때 이중 반복문으로 만들면 아래와같이 정리 가능
		
		
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", j, i, j * i);
			}
		}
	}
}