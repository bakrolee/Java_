import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		BigInteger value1 = new BigInteger("9223372036854775808");
		System.out.println(value1.add(new BigInteger("10"))); // 새로운 BigInteger를 만들어서 값을 반환.
		
		System.out.println(value1); // 10을 더해도 자기의 상태값은 변하지 않음.
		
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);
		System.out.println(d);
	}
}
