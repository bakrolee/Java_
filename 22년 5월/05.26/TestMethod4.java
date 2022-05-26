import java.util.*;

public class TestMethod4 {
	// 정수 하나를 전달받아 
	// 1 ~ 100 사이의 수이면 true를 반환하고,
	// 그렇지 않으면 false를 반환하는 메소드 작성
	
	public static boolean between(int number) {
		if (number >= 1 && number <= 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// 사용자가 국어, 영어, 수학 점수를 입력 하는데 (입력값은 무조건 1 ~ 100 사이여야함)
	// 입력한 점수와, 점수 합을 출력해보세요
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 		
			내가 푼 거
		
		int sum = 0;
		System.out.print("국어 점수를 입력해주세요");
		int kor = scan.nextInt();
		if (between(kor)) {
			System.out.print("영어 점수를 입력해주세요");
			int eng = scan.nextInt();
			
			if (between(eng)) {
				System.out.print("수학 점수를 입력해주세요");
				int math = scan.nextInt();
				
				if (between(math)) { 
					sum = kor + eng + math;
					System.out.printf("국어 점수: %d, 영어: %d, 수학 %d\n총 점수는 %d입니다.", kor, eng, math, sum);
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		} else {
			System.out.println("잘못 입력했습니다.");
		} */
		
		
		// 쌤 풀이
		int kor;
		int eng;
		int math;
		do {
			// 국어 점수 입력받기
			System.out.print("국어 점수? ");
			kor = scan.nextInt();
			// 국어 점수 확인
		} while ( !between(kor) ); // 1. 범위가 맞으면 다음, 2. 틀리면 다시 입력
		
		do {
			System.out.print("영어 점수? ");
			eng = scan.nextInt();
		} while ( !between(eng) );	
			
		do {
			System.out.print("수학 점수? ");
			math = scan.nextInt();
		} while ( !between(math) );	
		
		// 합 구하기
		int sum = kor + eng + math;
		// 국영수 점수 출력
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		// 합 출력
		System.out.println("총합: " + sum);
	}
}