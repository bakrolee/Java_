// 사용자에게 국어, 영어, 수학 점수를 정수로 입력받아
// 총점과 평균점수를 출력하는 프로그램

import java.util.Scanner;

public class Average {
	public static void main(String[] args){
		System.out.println("국영수 총점과 평균점수 구하기.\n");
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int k = input.nextInt();
		System.out.print("영어 점수: ");
		int e = input.nextInt();
		System.out.print("수학 점수: ");
		int m = input.nextInt();
		
		int sum = k + e + m;
		int avg = (k + e + m)/3;
		
		System.out.println("\n총점: " + sum);
		System.out.println("평균점수: " + avg);
	}
}