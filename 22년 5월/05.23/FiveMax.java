// 사용자가 입력한 5개 정수중 가장 큰수 출력

import java.util.Scanner;

public class FiveMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* int max = -9999;
		System.out.println("정수 5개를 입력하세요.");
		for (int i = 0; i < 5; i++) {
			// 정수 입력
			int num = scan.nextInt();
			// 입력한 정수를 임의의 수와 비교 후 대입
			if (max <= num) {
				max = num;
			}
		} */
		
		
		// 쌤 풀이
		int max;
		int first = scan.nextInt();
		max = first;
		
		for (int i = 0; i < 4; i++) {
			int next = scan.nextInt();
			
			if (max < next) {
				max = next;
			}
		}
		
		System.out.println("최대값: " + max);
	}
}