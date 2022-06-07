// 길이가 5인 정수형(int) 배열을 선언, 초기화하고
// 모든 원소(element)의 값을 100으로 설정해보세요.

public class Main2 {
	public static void main(String[] args) {
		int[] myBox = new int[5];
		
//		myBox[0] = 100;
//		myBox[1] = 100;
//		myBox[2] = 100;
//		myBox[3] = 100;
//		myBox[4] = 100;
//		myBox[5] = 100; // 자주하는 실수. 컴파일 에러는 안 뜸. 하지만 프로그램 강제종료됨.
		
		for (int i = 0; i < myBox.length; i++) {
			myBox[i] = 100;
			System.out.println(i + "번째 index의 원소값: " + myBox[i]);
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
