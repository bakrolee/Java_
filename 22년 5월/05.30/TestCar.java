public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1);
		
		// private 접근제한자
		// c.color = "빨강";  			// 외부에선 접근도 안 되고 (수정포함)
		// System.out.println(c.color);	// 외부에선 볼 수도 없음.
		
		// 해결법?
		// 내가 초기화한 값을 변경하고, 보고싶을때 접근을 메소드의 형태로 제공할 수 있다! 
		// (정보는 숨겨놓고, 알려달라고 할 때 행동을 통해 알려주거거나 변경해달라 할 때 변경)
		
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		c.setSpeed(20);
		System.out.println(c.getSpeed());
		
		c.setGear(4);
		System.out.println(c.getGear());
	}
}