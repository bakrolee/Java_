// 이중반복문
// : 반복문 안에 반복문을 사용하는 것

public class Loop2D {
	public static void main(String[] args) {
		
		for (int j = 0; j < 5; j++) {		// 아우터 루프는 나중에
			for (int i = 0; i < 5; i++) {   // 이너 루프를 먼저 확인 하기
				System.out.print('*');
			}
			System.out.println();
		}
	}
}