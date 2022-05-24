// 정수 2개와 연산자(문자열로 표기 : + - * /)등 을 입력받아 
// 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class HelloCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int a = input.nextInt();
		
		input.nextLine();
		System.out.print("연산자를 입력해주세요: ");
		String oper = input.nextLine();
		
		System.out.print("정수를 입력해주세요: ");
		int b = input.nextInt();
		
		int calc = 0;
		
		if (oper.equals("+")) {
			calc = a + b;
		} else if (oper.equals("-")) {
			calc = a - b;
		} else if (oper.equals("/")) {
			calc = a / b;
		} else if (oper.equals("*")) {
			calc = a * b;
		} else if (oper.equals("%")) {
			calc = a % b;
		} else {
			System.out.print("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print("결과는? " + calc);
	}
}
