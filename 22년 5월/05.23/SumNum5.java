// 사용자가 입력한 5개의 정수의 합 구하기
// 사용자 5번 입력할 것

import java.util.Scanner;

public class SumNum5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 입력
		System.out.println("5개의 정수 입력: ");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = input.nextInt();
			// 연산
			sum += num;
		}
		// 출력
		System.out.println("총합? " + sum);
	}
}