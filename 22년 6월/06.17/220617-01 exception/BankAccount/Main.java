package BankAccount;

//은행 계좌
//필드 : 잔고(int)
//메소드 : 입금(int) : void
//    출금(int) : void >> 출금액이 보유잔고 이상일 때, 예외를 발생(부족한 금액이 얼마?)시켜서 throws할 수 있게 
//    getter : int

public class Main {
	public static void main(String[] args) {
		Account acc = new Account(1000);
		
		try {
			acc.deposit(300);
			acc.withdraw(400);
			acc.withdraw(1000);
		} catch (ZeroRemainderException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}