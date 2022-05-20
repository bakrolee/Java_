// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요.

import java.util.Scanner;

public class LargeNumber {
	public static void main(String[] arges) {
		Scanner input = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시오.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max;
		// 가장 큰 수 출력하려면?
		// a > b이면 -> 큰 값은 a
		// a < b이면 -> 큰 값은 b
		// a > b && a < c -> 큰 값은 c    15 40 20
		if (a > c || b > c) {
			if (a > b) {
				max = a;
			} else {
				max = b;
			}
		} else {
			max = c;
		}
		System.out.println("가장 큰 수는? " + max);
	}
}