public class Loop3 {
	public static void main(String[] args) {
		// 0부터 100사이의 수 중 3의 배수 또는 7의 배수를 출력해보세요
		// 0 3 6 7 9 12 14 ...
		
		// i가 3의 배수면 true
		// i가 7의 배수면 true
		// 나머지는 false
		// i는 100보다 작다.
		
		// i = 0 일때
		// 검사 
		// -> i가 3 or 7의 배수인가?
		// -> false
		// -> i + 1
		// 다시 검사
		
		int i = 0;
		while (i < 100) {
			if (i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			} 
			i++;
		}
		
		
		// 0부터 100사이의 수 중 자리 수가 3, 6, 9 일때만 출력.
		// 3 6 9 13 16 19
		
		// 논리>
		// 일의 자리 숫자 구하면 됨.
		// j % 10 = 3 or 6 or 9
		int j = 0;
		while (j < 100) {
			if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) {
				System.out.println(j);
			}
			j++;
		}
	}
}