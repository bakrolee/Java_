// 사용자에게 정수 하나를 입력받아서
// 제곱 값을 출력하는 프로그램
import java.util.Scanner;

public class Squared {
	public static void main(String[] args){
		System.out.println("x의 제곱값을 구하시오. \n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = input.nextInt();
		
		System.out.print("x의 제곱: " + x * x);
	}
}