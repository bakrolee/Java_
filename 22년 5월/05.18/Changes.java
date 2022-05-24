import java.util.Scanner;

public class Changes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 구입할 상품의 가격 = price, 
		// 손님한테 받은 금액 = receive,
		// 부가세는 가격의 10% = price /10
		// 잔돈 = price - receive 
		
		System.out.print("받은 돈: ");
		int receive = input.nextInt();
		System.out.print("상품의 총액: ");
		int price = input.nextInt();
		
		System.out.println("부가세: " + price / 10);
		System.out.print("잔돈: " + (receive - price));
	}
} 