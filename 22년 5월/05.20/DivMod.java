// 정수 2개를 입력받아서 큰 수에서 작은 수로 나눈 몫과 나머지를 출력

// 출력할 값은 몫, 나머지
// if절 통해 임의의 두 수 중에 큰 수를 large로, 작은 수를 small로 지정해주면 됨


import java.util.Scanner;

public class DivMod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 2개 입력해주세요: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int large;   // 이거 밖에 선언 안 하고 if절 안에 선언해둬서 컴파일 에러떴음;; 주의!!
		int small;
		if (number1 != 0 && number2 != 0) {	
			if (number1 > number2) {
				large = number1;
				small = number2;
			} else {
				large = number2;
				small = number1;
			}
			System.out.printf("%s %d", "몫: ", large / small);
			System.out.printf("\n%s %d", "나머지: ", large % small);
		} else {
			System.out.println("0을 입력하면 안 됩니다.");
		}
		
		
	}
}