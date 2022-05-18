import java.util.Scanner;

public class MileToKillo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		double mile = input.nextDouble();
		
		double killo = mile * 1.609;
		System.out.print(mile + "마일은 " + killo + "킬로미터입니다.");
	}
}