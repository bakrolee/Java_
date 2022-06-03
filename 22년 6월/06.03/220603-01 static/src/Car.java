// p.207

public class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars = 0; // 이런 값은 public으로 거의 안 씀 : (이유) 언제 어디서 누가 값을 바꿨는지 알 수가 없기 때문에...
	// 만약 static으로 공유하고 싶을 때
	public static final int SHARE_NUMBER = 22;  // (이유) 상수는 어디서든 값을 변경할 수 없기 때문에 
	
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		id = ++numberOfCars;
	}
	
	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
	// 기타
	public static void printColor() {
//		System.out.println(color);  // 에러 뜨는 이유 : 필드값은 프로그램 시작 후에 만들어지기 때문에.
	}
}
