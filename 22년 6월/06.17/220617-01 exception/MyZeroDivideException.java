import java.time.LocalTime;

public class MyZeroDivideException extends RuntimeException {
	public MyZeroDivideException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생하였음.");
	}
}
