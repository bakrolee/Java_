// 2 ~ 100 사이의 모든 소수 출력하기

public class Prime100 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			
			// 소수는 1과 자신으로만 나누어지는 수 
			// -> 1과 자신으로 나눴을 때만 나머지가 0
			// eg. 7 ->  1 o 2 x 3 x 4 x ... 7 o -> count 2 -> true (소수)
			
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			// 해당 문장 위치를 잘못 위치시키면 결과값이 이상하게 나옴. 
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
