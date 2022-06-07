public class Main {
	public static void main(String[] args) {
		int[] aBox; // 정수형 배열 변수 선언.
		aBox = new int[4]; // 길이가 4인 배열 초기화, new가 있으니 객체. -> 고로 aBox = 참조변수. (참조 대상 : 4개의 배열을 담을 수 있는 박스)
		
		System.out.println("배열의 길이값: " + aBox.length);
//		aBox.length = 10; // 불가능. 배열은 초기화 할 때의 길이값을 변경할 수 없다.(final 성질, 상수)
		
		aBox[0] = 56;  // 제일 앞 인덱스에 56이 들어감.
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
}
