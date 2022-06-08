import java.util.Scanner;

// p.237 1번



public class Main2 {
//	public static void faultInput(int i) {
//		Scanner scan = new Scanner(System.in);
//		
//		while (i != 0 && i != 1) {
//			System.out.println("잘못 입력하셨습니다.");
//			i = scan.nextInt();
//		}
//	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Airplain seat = new Airplain();
		seat.space[7] = 1;
		seat.space[5] = 1;
		
		while(true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0)");
			int input = scan.nextInt();
			
			while (input != 0 && input != 1) {
				System.out.println("잘못 입력하셨습니다.");
				input = scan.nextInt();
			}
			
			if (input == 0) {
				break;
			}
		
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("--------------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------------------");
			seat.cheackR(seat.space);

			System.out.println("몇번째 좌석을 예약하시겠습니까?");
			int input2 = scan.nextInt();
			seat.reservation(input2-1);
		}
		System.out.println("프로그램 종료");
	}
}