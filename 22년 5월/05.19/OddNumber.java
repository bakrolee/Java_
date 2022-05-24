// 사용자가 입력한 정수가
// 짝수면 true
// 홀수면 false를 출력

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int x = input.nextInt();
		
		System.out.print((x % 2) == 0);  // 배수 찾기는 % 뒤의 숫자만 바꿔주면 가능. eg. 7의 배수는   x % 7 == 0
	}
}