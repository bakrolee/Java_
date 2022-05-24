// 구구단
// 사용자 입력을 받아 원하는 단수의 구구단 출력 

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 4 * 1 = 4
		// 4 * 2 = 8
		// 4 * 3 = 12
		// ...
		// 4 * 9 = 36
		
		System.out.print("몇 단? ");
		int j = input.nextInt();
		
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", j, i, j * i);
			i++;
		}
	}
}