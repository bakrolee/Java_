// 반복문 기초2

public class Loop2 {
	public static void main(String[] args) {
		
		// 1 ~ 10000까지 출력하세요.
		/* int i = 0;
		while (i < 10000) {
			System.out.println(i + 1);
			i++;
		} */
		
		// 20 ~ 29까지 출력하기
		int j = 20;
		while (j <= 29) {
			System.out.println(j);
			j++;
		}
		
		// 10 9 8 ~ 0 까지 출력하기
		int k = 10;
		while (k >= 0) {
			System.out.println(k);
			k--;
		} 
		
		// 3의 배수 출력하기 (100보다 작은)
		int l = 0;
		while (l < 100) {
			System.out.println(l);
			l += 3;
		}
		
		// ☆
		// ★
		// ☆
		// ★
		// ☆
		// ★
		// ☆
		// ★
		int q = 0;
		while (q < 8) {
			// System.out.println((q % 2 == 0) ? "☆" : "★");
			if (q % 2 == 0) {
				System.out.println("☆");
			} else {
				System.out.println("★");
			}
			q++;
		}
	}
}