public class Car {
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}

	public void setSpeed(double s) {
		speed = (int) s;
		System.out.println("실수 버전 호출");
	}
}
