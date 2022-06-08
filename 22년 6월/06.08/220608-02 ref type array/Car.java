// p.231-2

public class Car {
	public int speed;
	public int gear;
	public String color;

	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}

	public void speedUp() {
		speed += 10;
	}

	public String toString() {
		return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
	}
}
