package BankAccount;

public class ZeroRemainderException extends RuntimeException {
	private int lack;
	
	public ZeroRemainderException(String message) {
		super(message);
	}

	public int getLack() {
		return lack;
	}
}
