// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인 메소드에서 호출하여 출력을 통해 값을 확인해보세요.

public class CircleArea {
	public static double area (double r) {
		return 3.14 * r * r;
	}
	
	public static void main(String[] args) {
		double number = 3.3;
		double result = area(number);
		System.out.println(result);
	}
}