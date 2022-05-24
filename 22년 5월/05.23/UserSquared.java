// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

import java.util.Scanner;

public class UserSquared {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수? ");
		int n = scan.nextInt();
		System.out.println("몇 제곱? ");
		int m = scan.nextInt();

		long squ = 1;
		for (int i = 0; i < m; i++) {
			// 만약 n이 3이고, m이 5일 때
			// 3, 3*3, 3*3*3, 3*3*3*3, 3*3*3*3*3 이라는 결과가 나와야 함.
			// n, n*n, n*n*n, ...
			squ = squ * n;
		}
		System.out.println("결과? ");
		System.out.println(squ);
	}
}