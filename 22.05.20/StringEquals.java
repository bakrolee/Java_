// 똑같은 문자열인지 찾기
// .equals(?);
// 하나만 비교할 수 있다. 
// 문자비교할 땐 관계연산자 가지말기!

public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";  
		String b = "Hello";  
		System.out.println(a == b);
		// 주의할 건 문자열의 특성 : 참조형이라는 것!
		// 두 대상이 같은지 비교할 때 값을 확인하는 것이 아니라,
		// 참조하는 대상이 같은지 확인함!
		
		
		// 예제 : 값을 확인하지 않는다는 것을 보여줌.
		String llo = "llo";
		System.out.println(a == ("He" + llo));  // 값은 같지만... false!
		// 이유
		// 실행시 Hello / llo / He 
		// -> Hello (a가 참조중)
		// -> (new) Hello = He + llo 결합하여 새로운 문자열 생성
		
		
		// 해결법 = .equals(?); 메소드
		// 대조군 = a,b 일때
		// a.equals(b + "he");
		// 값을 비교해줌. 참조를 신경쓰지 않음.
		System.out.println("------- 문자열 값 동등 확인 -------");
		System.out.println(a.equals("He" + llo));
	}
}