/* 별 출력 6

사용자가 원하는 모양으로, 원하는만큼
그때그때 다르게 출력하기    */
import java.util.*;

public class Star6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 6 중 원하는 모양 선택하세요: ");
		int select = scan.nextInt();
		System.out.print("사이즈: ");
		int size = scan.nextInt();
		
		switch (select) {
			case 1:
				for (int i = 1; i <= size; i++) {
					for (int j = 1; j <= i ; j++) {
						System.out.print("*");
					} 
					System.out.println();
				} 
				break;
			case 2:
				for (int i = 1; i <= size; i++) {
					for (int j = size; j >= i; j--) {
						System.out.print("*");
					} 
					System.out.println();
				}
				break;
			case 3:
				for (int i = 1; i <= size; i++) {
					for (int j = size; j - 1 >= i; j--) {
						System.out.print(" ");
					}
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 4:
				for (int i = 1; i <= size; i++) {
					int space = (size - i) * 2;
					for (int j = (size - 1); j >= i; j--) {
						System.out.print(" ");
					}
					for (int j = 1; j <= (size * 2 - 1) - space; j++) {
						System.out.print("*");
					}
					for (int j = (size - 1); j >= i; j--) {
						System.out.print(" ");
					}
					System.out.println();
				}
				break;
			case 5:
				for (int i = 1; i <= size; i++) {
					int star = (i - 1);
					for (int j = 1; j <= star; j++) {
						System.out.print(" ");
					} 
					for (int j = (size * 2) - 1; j - star >= i; j--) {
						System.out.print("*");
					}
					for (int j = 1; j <= star; j++) {
						System.out.print(" ");
					} 
					System.out.println();
				}
				break;
			case 6: 
				if (size % 2 == 1) {
					for (int i = 1; i <= size; i++) {
						// 위쪽 삼각형
						if (i <= size / 2 + 1) {
							for (int j = 1; j <= (i - 1); j++) {
								System.out.print(" ");
							}
							for (int j = size; j > (i - 1) * 2; j--) {
								System.out.print("*");
							} 
						} 
						// 아래쪽 삼각형
						else {
							// size가 7  i는 5,6,7 일 때  -> 공백은 2,1,0 / 별은 3,5,7
							for (int j = size; j > i; j--) {
								System.out.print(" ");
							}
							// size 7
							// -> i = 5,6,7
							// 별 3, 5, 7
							// 7-4/ 7-2/ 7-0
							for (int j = 1; j <= size - (size - i) * 2; j++) {
								System.out.print("*");
							}
						}
						System.out.println();
					}
				} else {
					System.out.println("사이즈를 홀수로 입력해주세요.");
				}
				break;
			default: 
				System.out.print("잘못 입력하셨습니다.");
				break;
		}
		
	}
}
