// 사용자가 입력한 정수가
// 소수임을 확인하여 출력하는 프로그램
import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = scan.nextInt();
		int count = 0;
		int prime = 2;
		// eg. 8 -> /1가능, /2,3,4,5,6,7 나눠지면 안됨.
		if (input == 1) {
				System.out.println("소수입니다.");
		}
		else if (input > 1) {
			for (int i = 1; i <= input; i++) {
				if (input % i == 0) {
					count++;
				}
			}
			if (prime == count) {
				System.out.printf("%d는 소수입니다.", input);
			} else {
				System.out.printf("%d는 소수가 아닙니다.", input);
			}
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
	}
}