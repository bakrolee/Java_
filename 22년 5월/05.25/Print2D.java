// 이중반복 응용2

// 아래와 같이 출력하기

// (1, 1) (1, 2) (1, 3) (1, 4)
// (2, 1) (2, 2) (2, 3) (2, 4)
// (3, 1) (3, 2) (3, 3) (3, 4)
// (4, 1) (4, 2) (4, 3) (4, 4)


public class Print2D {
	public static void main(String[] args) {
		
		// 1. 얘를 먼저 만들어 봄. (가로열)
		// for (int i = 1; i <= 4; i++) {
			// System.out.printf("(%d, %d) ", 1, i);
		// }
		
		// 2. 그다음 세로열의 숫자만 2,3,4로 바꿔주면 되니깐 '아우터 반복문'을 생성해봄
		for (int j = 1; j <= 4; j++) {
			for (int i = 1; i <= 4; i++) {
				System.out.printf("(%d, %d) ", j, i);
			}
			System.out.println(); // 이너반복 진행 후 줄바꾸기
		}
	}
}