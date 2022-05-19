// 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력. 나머지는 false
// 예) 1 2 3 -> true,  4 5 6 -> true,  7 9 10 -> false

import java.util.Scanner;

public class ContinueTrd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 순서대로 입력해 주세요: ");
		int x = input.nextInt();
		System.out.print("두 번째 정수를 순서대로 입력해 주세요: ");
		int y = input.nextInt();
		System.out.print("세 번째 정수를 순서대로 입력해 주세요: ");
		int z = input.nextInt();
		
		System.out.print("세 정수는 1씩 증가하고 있는가? ");
		System.out.print(y - x == 1 && z - y == 1);
	}
}