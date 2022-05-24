// 2 ~ 9까지의 무작위의 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우

// 사용자 입력
// : 6 o
// : 12 o
// : 18 o
// : 21 X 종료

import java.util.*;

public class MulSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x;
		do {
			x = ran.nextInt(10);  // 0 ~ 9까지 무작위 수
		} while (x < 2);
		
		System.out.printf("%d의 배수를 순서대로 입력하세요.\n", x);
		
		for (int i = 1; ; i++) {
			int input = scan.nextInt();
			// 정답과 비교
			if (input != (x * i)) {
				System.out.println("X");
				break;
			}
			System.out.println("O");
		}
		System.out.print("프로그램 종료");
	}
}