// do while
// 한번은 반드시 실행된다. while이 false라도.
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/* while (false) {
			문장1 
		} */
		
		do {
			System.out.println("실행되나?");  // 반복될 문장
		} while (false);
		
		
		// 예제
		Scanner scan = new Scanner(System.in);
		System.out.println("10을 나눌 수 입력하라");
		
		// 이때 사용자는 한번밖에 기회가 없음. 0 입력하면 끝.
		int num = scan.nextInt();
		if (num == 0) {
			System.out.println("0으로 나눌 수 없음");
		} else {
			System.out.println(10 / num);
		}
		
		// do while 사용
		// 0을 입력하면 다시 입력할 기회를 계속해서 주고
		// 제대로 입력하면 정상적으로 넘어갈 수 있게 함.
		do {
			num = scan.nextInt();
			if (num == 0) {
			System.out.println("0으로 나눌 수 없음");
			}
		} while(num == 0);  // while 뒤 세미콜론 주의!
		System.out.println(10 / num);
	}
}