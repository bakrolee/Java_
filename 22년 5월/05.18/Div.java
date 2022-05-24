import java.util.Scanner;

public class Div {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int x = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		int y = input.nextInt();
		
		int div = x / y;
		int r = x % y;
		
		System.out.print(x + "를 " + y + "로 나눈 몫은 " + div + "이고 나머지는 " + r + "입니다.");
		
	}
}