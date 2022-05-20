// 정수를 문자열로 바꾸는 방법

public class IntegerToString {
	public static void main(String[] args) {
		String strNum = String.valueOf(12345);  // 정수를 문자로 바꿔줌
		System.out.println(strNum);
		
		int i = 5055;
		String strNum2 = "" + i; // 꼼수
		System.out.println(strNum2.charAt(1));
	}
}