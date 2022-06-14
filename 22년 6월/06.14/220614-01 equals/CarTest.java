import javax.print.attribute.standard.MediaSize.Other;

class Car {
	private String model;
	
	public Car(String model) {
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {  // 자바에서 만든 head
		// 내가 재정의 할 body
		if (obj instanceof Car) {	// 1. 비교군 설정 (Car만 비교할거다)
			Car otherCar = (Car) obj;	// 2. 다운캐스팅 후
			return model.equals(otherCar.model);  // 3. 재정의 : Car의 상태인 model로 비교할 거다.
		} else {
			return false;
		}
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
	}
}
