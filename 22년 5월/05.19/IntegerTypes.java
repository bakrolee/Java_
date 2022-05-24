public class IntegerTypes {
	public static void main(String[] args){
		byte b = 100;
		short s = 30000;
		int i = 10_000_000;   // 자릿수를 ,로 나타내면 컴파일 에러 뜸. ( _로 자릿수 표현 )
		long l = 123456789L;  /* L = 컴파일러에게 왼쪽에 있는 숫자가 롱타입의 큰 숫자임을 알려줌
							     만약 없다면 컴파일러가 인트값으로 인식함. */
		// byte b2 = 100;
		// byte sum = b + b2;
		// System.out.println(sum);
		
		// int bs = b + s;
		// System.out.println(bs);
		
		// long sum = 100 + 100L;
		// System.out.println(sum);
	}
}