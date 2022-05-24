import java.util.Scanner;

public class Volume {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		// 입력 받을 값 = 구의 반지름, r, 실수
		// 출력할 값 = 4 / 3 * r * r * r, 실수
		
		System.out.print("반지름: ");
		
		double r = input.nextDouble();
		System.out.print("구의 부피는: " + 4.0 / 3.0 * r * r * r);
	}
}