// p.207

public class CarTest3 {
	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 1);
		c1.printStaticNumber();
		Car c2 = new Car("white", 0, 1);
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수  = " + n);
		
		c1.printStaticNumber();
	}
}
