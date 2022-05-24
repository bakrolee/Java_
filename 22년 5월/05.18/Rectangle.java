// 사용자의 사각형의 밑변과 높이를 정수로 입력
// 사각형의 둘레와 넓이를 출력
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("사각형의 둘레, 넓이 구하시오. \n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사각형의 밑변의 값: ");
		int length = scanner.nextInt();
		
		System.out.print("사각형의 높이의 값: ");
		int height = scanner.nextInt();
		
		System.out.println("사각형의 둘레: " + (length + height)*2);
		System.out.println("사각형의 넓이: " + length * height);
		
	}
}