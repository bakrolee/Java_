import java.util.Scanner;

// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기

// 예) 10 20 30 40 50 -> 50 40 30 20 10


// 사용자가 0이하의 정수를 입력할 때까지 반복하여 입력
// 최근 5개를 출력 (순서상관없음)

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60



public class Main5 {
	static int[] array(int[] target) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(true) {
			target[i] = scan.nextInt();
			i++;
			if (i == 5) {
				i = 0;
			}
			if (target[i] < 0) {
				break;
			}
		}
		return target;
	} 
			
			
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] target = new int[5];
		
		System.out.println("정수 5개를 입력해주세요.");
		
		for (int i = 0; i < target.length; i++) {
			target[i] = scan.nextInt();
		}
		
		System.out.println("역순 출력.");
		for (int i = (target.length - 1); i >= 0; i--) {
			System.out.print(target[i]);
		}
	
		
	}
}
