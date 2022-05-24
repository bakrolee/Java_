// 사용자가 정수 범위를 지정 (시작-끝 입력)
// 합

import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작? ");
		int start = scanner.nextInt();
		System.out.println("끝? ");
		int end = scanner.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("총합은? ");
		System.out.println(sum);
	}
}