public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78;
		
		// a = a + 5;
		a += 5;   // 복합연산자 += : 위의 과정을 축약.
		System.out.println(a);
		
		a -= 3;
		System.out.println(a);
		a *= 2;
		System.out.println(a);
		a /= 4;
		System.out.println(a);
		a %= 3;
		System.out.println(a);
	}
}