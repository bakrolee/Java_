// 반복문 기초

public class Loop1 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println("반복됩니다.");
			i++;
		}
		
		// Hello world 10번 출력하기
		int j = 0;
		while (j < 10) {
			System.out.println("Hello world");
			System.out.println("j는?" + j);
			j++;
		}
		
		// 1 ~ 10 출력하기
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k++;
		}
		// System.out.println(1);
	}
}