// 자판기 프로그램
// 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름 돈은 얼마인지 출력하세요 (외상 안 됨)

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// 1. 사용자에게 돈을 입력 받는다. eg. 10000만원
		// 2. 입력받은 돈에서 1, 2, 3번 중 선택을 하게 한다.
		// 3. 잔액이 마이너스가 되기 전까지 반복할 수 있게 한다.
		//    (잔액이 마이너스가 되면 "잔액이 부족하다"고 메시지를 나타낸다.
		// 4. 총 몇 개의 캔을 구입했는지 개수를 센다.
		// 5. 남은 잔액이 얼마인지 거스름돈을 표기한다.
		
		System.out.println("돈을 입력해주세요. ");
		int money = scan.nextInt();
		int count = 0;
		
		int i = 1;
		while (i > 0) {
			System.out.print("다음 3가지 중 선택해주세요. \n1번 콜라 : 1500원, 2번 사이다 : 1300, 3번 계산 - ");
			int sel = scan.nextInt();
				
					if (sel == 1) {
						if (money > 1500) {
							money -= 1500;
							count++;
						} else {
							System.out.println("잔액이 부족합니다. 다시선택해주세요.");
						}
					} else if (sel == 2) {
						money -= 1300;
						count++;
					} else if (sel == 3) {
						i = -1;
						System.out.println("거스릅돈? " + money);
					}
					
				
				
					
				
			} 
		
		System.out.println("총 몇 개의 캔을 구입? " + count);
		// System.out.println("거스릅돈? ");
	}
}