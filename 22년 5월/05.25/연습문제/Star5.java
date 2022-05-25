/* 별 출력하기 5

********* (9)
 *******  (7)
  *****   (5)
   ***    (3)
    *     (1) */
	
public class Star5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			
			int star = (i - 1);
			
			for (int j = 1; j <= star; j++) {
				System.out.print(" ");
			} 
			
			for (int j = 9; j - star >= i; j--) {
				System.out.print("*");
			}
			
			for (int j = 1; j <= star; j++) {
				System.out.print(" ");
			} 
			
			System.out.println();
		}
	}
}
