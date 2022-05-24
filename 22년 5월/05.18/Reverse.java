import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("5자리 정수를 입력하세요: ");
		int x = input.nextInt();
		
		// 임의의 숫자 12345(임의의 입력받을 숫자)를 -> 어떻게 54321(역순)로 출력시킬까?
		// 47512 -> 47512 % 10 = 2
		
		int one = x / 10000;
		int two = (x % 10000) / 1000;  
		int three = (x  % 1000) / 100;
		int four = (x % 100) / 10;
		int five = x % 10;
		
		System.out.print("역순 값: " + five + four + three + two + one);
		
	}
}