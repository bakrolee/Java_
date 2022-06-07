import java.util.Scanner;

public class Print {
	// 사용자에게 5번의 정수를 입력받아
	// 최근 입력한 순(역순)으로 출력하기

	// 예) 10 20 30 40 50 -> 50 40 30 20 10
	Scanner scan = new Scanner(System.in);
	
	int[] target;
	public int[] input() {
		for (int i = 0; i < 5; i++) {
			target[i] = scan.nextInt();
		}
		return target;
	}
	
	public void printR() {
		System.out.println(input());
	}
}
