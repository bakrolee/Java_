// 별 출력하기 2

// *****
// ****
// ***
// **
// *

public class Star2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
