public class CharType {
	public static void main(String[] args){
		char a = 'a';  // '' = 문자 1개만 표현 가능. 2개이상 넣으면 에러. eg. 'ab'
		char b = 'b';
		char ga = '가';
		char num1 = '1';
		
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(ga);
		// System.out.println(num1);
		
		char what = 65;  // 아스키 코드에 담긴 문자 나옴.
		System.out.println(what);
		System.out.println(what + a);
	}
}