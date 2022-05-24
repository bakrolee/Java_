import java.util.Scanner;

public class SaveMoney {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int c500, c100, c50, c10;
		
		
		System.out.print("500원 개수: ");
		c500 = input.nextInt();
		System.out.print("100원 개수: ");
		c100 = input.nextInt();
		System.out.print("50원 개수: ");
		c50 = input.nextInt();
		System.out.print("10원 개수: ");
		c10 = input.nextInt();
		System.out.print("저금통에 남은 돈: ");
		System.out.print(c500 * 500 + c100 * 100 + c50 * 50 + c10 * 10);
	}
}