// 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력. 나머지는 false
// 예) 1221 -> true,  1557 -> false,  9009 -> true

import java.util.Scanner;

public class SameLeRi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 좌우가 같은 경우 = 역순으로 했을 때 같은 거
		// 역순 구하고, 입력받은 수와 같은지 하면 되나?
		// 근데 한번에 4자리 숫자를 받음. eg. 1551 
		// 이걸 어떻게 역순으로?
		// 나머지? 
		// 1) 1551 % 10 = 1 -> 1*10 (right1)
		// 2) 1551 / 10 = 155 -> 155 % 10 = 5 (right2)
		// 잠깐.
		// 1551 / 100 = 15 (left)
		// left == right1 + right2
		// 근데 논리연산자 사용하지 않으므로 패스.
		
		// 2. 
		// 1551 / 1000 == 1551 % 10
		// 1551 / 100 % 10 == 1551 / 10 % 10
		
		System.out.print("4자리 정수를 입력해주세요: ");
		int i = input.nextInt();
		
		System.out.print("좌우 숫자가 같은가? ");
		System.out.print(i / 1000 == i % 10 && i / 100 % 10 == i / 10 % 10);
	}
}