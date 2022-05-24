// 문자열의 순서를 찾아서 정수로 알려주는 메소드

public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o");  // 왼쪽부터 찾음! (0부터 시작!)
		System.out.println(index); 
		
		int notFound = hello.indexOf("a"); // 없는 문자는 무조건 -1로 나옴
		System.out.println(notFound);
		
		int index2 = hello.indexOf("ll");
		System.out.println(index2);
		
		int index3 = hello.lastIndexOf("l");  // 오른쪽부터 찾는 메소드
		System.out.println(index3);
		
		int index4 = hello.indexOf("l", 3);  // 시작점 지정하기.
		System.out.println(index4);
	}
}