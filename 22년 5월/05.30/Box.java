public class Box {
	int width;
	int length;
	int height;
	
	public Box() {  // 기본 생성자 : 괄호 안에 내용 안 쓰면 기본값, 내용 쓰면 그 값으로 초기화
		width 1;
		length 1;
		height 1;
	}
	
	public Box(int w, int l, int h) {  // 커마 생성자 : 파라미터에 입력한 값으로 초기화 가능케 함.
		width = w;
		length = l;
		height = h;
	}
	
	public static void main(String[] args) {
		Box b = new Box(4, 4, 4);
		
		System.out.println(b.width);
		System.out.println(b.length);
		System.out.println(b.height);
		
		// 박스 인스턴스화. 생성자를 호출해서 가로 90 세로 100 높이 110
		Box b2 = new Box(90, 100, 110);
		
		
		Box b3 = new Box();  // 기본 생성자가 있어야 컴파일 에러 안 뜸
	}
}