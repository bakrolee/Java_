// 문자열 - index 메소드

public class TestString2 {
	public static void main(String[] args) {
		String hello = "Hello";  
		
		char h = hello.charAt(0);  //  (주의) index는 0부터 시작함!
		System.out.println(h);
		System.out.println(hello.charAt(1));
		// System.out.println(hello.charAt(-1));  음수는 없음!
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		int length = hello.length();  // 이 메소드는 글자의 길이를 정수로 알려줌.
		System.out.println(length);
	}
}