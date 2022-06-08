// p.231-2

public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].speedUp();
		}
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);  
			// 되는 이유 : 객체를 문자열의 형태로 다루고자할 때 toString이 호출됨. 
			//	       -> 우리가 미리 toString을 만들어놨기에 그 값이 반환됨.
		}
	}
}
