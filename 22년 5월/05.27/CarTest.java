class Car {
	// 필드 정의
	String color;	// 색상
	int speed;		// 현재 속도
	int gear;		// 현재 기어
	
	// 메소드
	void print() {
		System.out.println("("+ color + ", " + speed + ", " + gear + ")");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();  // new Car(); = 인스턴스화 
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		// 색상: blue, 속도: 60, 기어: 3인 자동차 인스턴스를 하나 만들고, 
		// 참조변수를 만든 후 값을 대입연산 후 프린트 호출하기
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
		
		yourCar.print();
	}
}