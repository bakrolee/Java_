/* 별 출력하기 4

    *     (1)  4 1 4
   ***    (3)  3 3 3 
  *****   (5)  2 5 2
 *******  (7)  1 7 1
********* (9) */

public class Star4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			int space = (5 - i) * 2;
			
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 9 - space; j++) {
				System.out.print("*");
			}
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			
			System.out.println();
		}
	}
}
