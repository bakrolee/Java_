// p.242-243

public class Main {
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "Red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		
		Car nomalCar = new Car();
		nomalCar.color = "Green";
		nomalCar.speedUp(30);
		nomalCar.speedDown(20);
//		nomalCar.setTurbo(true);
	}
}
