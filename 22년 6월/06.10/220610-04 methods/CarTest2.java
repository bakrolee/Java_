// p.184

public class CarTest2 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
		
		myCar.setSpeed(1000L); // 실수버전 호출 됨 -> 이유: double과 long은 담을 수 있는 크기가 비슷
		myCar.setSpeed('A'); // 정수버전 호출 됨 -> 이유: 아스키 코드로 인해 정수로 판단.
//		myCar.setSpeed("A"); // error (문자열로 판단)
	}
}
