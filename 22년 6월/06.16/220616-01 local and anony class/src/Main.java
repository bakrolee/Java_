interface PrintAll {
	void printAll();
}

public class Main {
	public static void main(String[] args) {
		// local class (일회용)
//		class Point {
//			int x;
//			int y;
//			public Point(int x, int y) {
//				super();
//				this.x = x;
//				this.y = y;
//			}
//		}
//		Point p = new Point(10, 20);
		
		
		
		// 인터페이스 & 이름없는 클래스
// 1. 원래 이렇게 하면 되는데, 할 때마다 클래스 이름도 만들어야 하니 귀찮.
		class Point implements PrintAll {
			int x;
			int y;
			public Point(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
			@Override
			public void printAll() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		Point p = new Point(10, 20);
		p.printAll();
		
// 2. (해결책) 인터페이스 참조변수로 이름없는 클래스 참조하게 함.
		PrintAll a = new PrintAll() { // 중괄호 안에는 인터페이스를 구현하는 내용이 들어가면됨.
			@Override
			public void printAll() {
				System.out.println("출력할 값이 없음.");
			}
		};
		a.printAll();  // a는 이름없는 인스턴스를 참조하는 변수.
	}
}
