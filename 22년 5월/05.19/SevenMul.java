// 사용자가 입력한 정수가 0이상이며 7의 배수일 때 true를 출력, 나머지는 false

import java.util.Scanner;

public class SevenMul {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int x = input.nextInt();
		
		System.out.print(x >= 0 && x % 7 == 0);
	}
}