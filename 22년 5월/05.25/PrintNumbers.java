// 이중반복 연습

// (1) (2) (3) (4) (5) 홀수 행
// (5) (4) (3) (2) (1) 짝수 행
// (1) (2) (3) (4) (5) 홀
// (5) (4) (3) (2) (1) 짝
// (1) (2) (3) (4) (5) 홀

public class PrintNumbers {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 5; j++) {
					System.out.printf("(%d) ", j);
				}
				System.out.println();
			} else {
				for (int j = 5; j >= 1; j--) {
					System.out.printf("(%d) ", j);
				}
				System.out.println();
			}
		}
		/* 
		1. 출력 형태 
		System.out.printf("(%d) (%d) (%d) (%d) (%d)\n", 1, 2, 3, 4, 5);
		
		2. 
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.printf("(%d)", i); 
			} else {
				System.out.printf("(%d)", 6 - i);
			} 
			
		3. 마지막 if 안에 for문 넣어서 짝수일 때 5,4,3,2,1 로 나오게 하면 위의 식 나옴.
				
		*/
	}
}