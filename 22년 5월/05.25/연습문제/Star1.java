// 별 출력하기 1

// *
// **
// ***
// ****
// *****

public class Star1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

