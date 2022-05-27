public class TestBox {
	public static void main(String[] args) {
		Box box1; 			// type : Box, box1이라는 이름을 가진 참조형 변수가 선언. (참조할 대상 = Box )
		
		box1 = new Box();   // 인스턴스가 만들어짐.
							// 여기선 가로,세로,높이라는 값을 만들 수 있는 공간이 만들어짐.
		// 작은 박스 만들기	
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		
		Box box2 = new Box();  // box1과 별개의 인스턴스
		
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		System.out.println(box1.width);
		System.out.println(box2.width);
		
		
		// box1.width = 5;	// 값 변경 가능
		// System.out.println(box1.width);
		
		
		// 참조형 변수는 null을 참조할 수 있음
		// Box none = null; 
		// none.width = 10;  // 컴파일은 됨. (이유: 박스를 가리키고 있으니깐 가로값이 있을 거라고 판단함)
						     // 실행시 에러로 인해 프로그램 종료
		
		
		// System.out.println(box1.color);  // color라는 필드가 없으므로 컴파일 에러
		
		
		box1.printAllState();  //
		box2.printAllState();  // 같은 동작인데 인스턴스가 가지고있는 값(상태)에 따라서 다른 동작을 나타냄. 
							   // (이유 : 인스턴스 각각이 고유하게 값을 가지고 있기 때문)
		
		
		// System.out.println("부피: " + box1.volume);  // 결과값이 제대로 나오지 않음.
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
	}
}