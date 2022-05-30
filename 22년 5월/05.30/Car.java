// p200 + 수업내용 추가

// 1. this
// 2. private 

public class Car {
	private int speed;
	private int gear;
	private String color;  // 'Car'라는 자기 자신의 범위 안에서만 사용 가능. (private 때문)
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c) {
		this(c, 0, 1);	// 언제나 문장의 첫줄이어야 함.
		System.out.println("초기화 과정 중~~");
	}
	
	// 접근 = getter
	public String getColor() {
		return color;
	}
	
	// 설정(색상) = setter
	public void setColor(String c) {
		color = c;
	}
	
	
	// 연습
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	
	public void setGear(int g) {
		gear = g;
	}
	public int getGear() {
		return gear;
	}
}