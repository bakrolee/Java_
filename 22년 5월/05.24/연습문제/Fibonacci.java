// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100 이하

// 이전의 숫자 2개를 더한 다음 값을 나열함
// 1+1=2, 1+2=3, 2+3=5, ...

public class Fibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = a + b;
		while(true) {
			System.out.println(a);
			a = b;
			b = c;
			c = a + b;
			if (a > 100) {
				break;
			}
		}
		
	}
}