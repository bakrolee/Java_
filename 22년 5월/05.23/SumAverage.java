// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후
// 정수를 입력하면 
// 합과 평균을 구해서 출력

// 2.
// 사용자의 입력을 분류해서
// 짝수끼리 합과 평균 값
// 홀수끼리 합과 평균 값


import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 입력하시겠습니까? ");
		int count = scan.nextInt();
		
		int sum = 0;
		System.out.println("정수를 입력해주세요. ");
		for (int i = 0; i < count; i++) {
			int input = scan.nextInt();
			if (int even % 2 == 0) {
				sum += even;
			} else if (int even % 2 != 0) {
				sum += scan.nextInt();
			}
		}
		
		double average = (double) sum / count;
		System.out.println("총합? " + sum);
		System.out.println("평균? " + average);
		
	}
}