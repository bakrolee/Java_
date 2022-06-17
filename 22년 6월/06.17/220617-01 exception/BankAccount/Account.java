package BankAccount;

public class Account {
	private int remainder;

	public Account() {
		super();
	}
	
	public Account(int remainder) {
		super();
		this.remainder = remainder;
	}

	public int getRemainder() {
		return remainder;
	}
	
	public void deposit(int money) {
		remainder += money;
		System.out.println("현재 잔고는 : " + remainder + "원 입니다.");
	}
	
	public void withdraw(int money) throws ZeroRemainderException {
		int minus = remainder - money;
		if (minus > 0) {
			remainder = minus;
			System.out.println("현재 잔고는 : " + remainder + "원 입니다.");
		} else {
			throw new ZeroRemainderException("\n출금실패. 잔액이 " + minus * -1 + "원 부족합니다.");
		}
	}
	
	
}
