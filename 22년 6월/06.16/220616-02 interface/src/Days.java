public interface Days {
	// public static final int NUM = 10; 을  아래로 축약.
//	int NUM = 10;
	int MONDAY = 1;
	int TUESDAY = 2;
	int WEDNESDAY = 3;
}

interface MyInterface {
	default void printHello() {  // 자식마다 무조건 override해줄 필요는 없음. 내가 원할때만 override해주면 됨.
		System.out.println("Hello");
	}
	
	public static void myStaticMethod() {}
	
//	(private) static int sum(int a, int b) {  // 인터페이스는 java 9버전부터는 private이 붙을 수 있음.
//		return a + b;
//	}
}