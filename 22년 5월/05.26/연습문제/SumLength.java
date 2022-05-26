// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드

public class SumLength {
	public static int length(String a, String b) {
		return a.length() + b.length();
	}
	
	public static void main(String[] args) {
		length("abcd", "efg");
		System.out.println(length("abcd", "efg"));
	}
}