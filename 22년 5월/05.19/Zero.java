// 사용자가 입력한 두 정수의 합을 출력하고, 
// 합이 0이면 true를 출력하고
// 그렇지 않은 경우 false를 출력해보세요.

import java.util.Scanner;

public class Zero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요: ");
		int num1 = input.nextInt();
		System.out.print("두 번째 정수를 입력해주세요: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.println("두 정수의 합: " + sum);
		
		boolean result = (sum == 0);
		System.out.println("두 수의 합이 0과 같은가? " + result);
	}
}