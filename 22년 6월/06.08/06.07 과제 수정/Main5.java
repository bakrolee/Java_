import java.util.Scanner;

// 1.
// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기

// 예) 10 20 30 40 50 -> 50 40 30 20 10


// 2.
// 사용자가 0이하의 정수를 입력할 때까지 반복하여 입력
// 최근 5개를 출력 (순서상관없음)

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60

public class Main5 {
	// 1번문제 메소드
	static int[] five(int[] target) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < target.length; i++) {
			target[i] = scan.nextInt();
		}
		return target;
	}

	static void printR(int[] target) {
		System.out.print("역순 출력: ");
		for (int i = (target.length - 1); i >= 0; i--) {
			System.out.print(target[i] + " ");
		}
	}
	
	// 2번문제 메소드
	static int[] array(int[] target) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(true) {
			int j = scan.nextInt();
			if (j >= 0) {
				target[i] = j;
				i++;
				if (i == 5) {
					i = 0;
				} 
			} else {
				break;
			}
		}
		return target;
	} 
	
	static void printArray(int[] target) {
		System.out.print("5개 출력: ");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
	}
			
			
	public static void main(String[] args) {
		final int MAX_LENGTH = 5;  // 5개만 출력해야하기 때문에, 변하면 안 되므로 상수 사용.
		int[] target = new int[MAX_LENGTH];
		
		// 1번 
		System.out.println("정수 5개를 입력해주세요.");
		five(target);
		printR(target);
		
		// 2번
		System.out.println();
		System.out.println("정수 여러개를 입력해주세요. (음수 입력시 출력)");
		printArray(array(target));
	}
}
