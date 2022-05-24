// if문 축약형
// -> 

public class OnelineIf {
	public static void main(String[] args) {
		boolean con = true;
		
		// 1. 중괄호 생략 - then절이 한 문장일 때
		if (con) 
			System.out.println("참일 경우 실행할 문장");
		else 
			System.out.println("거짓일 경우 실행할 문장1");  // 여기서 중괄호 닫힘.
			System.out.println("거짓일 경우 실행할 문장2");  // else 절에 포함 안 됨.
			
		// 한 문장일 경우 줄바꿈 하지 않고 쭉 적어도 됨.
		if (con) System.out.println("참일 경우 실행할 문장"); else System.out.println("거짓일 경우 실행할 문장1"); 
		

		// 2. 삼항연산자 = ? (축약형)
		String result = (con) ? "참" : "거짓";
		
		// 문장출력은 안 됨
		// (con) ? System.out.println("참 출력") : System.out.println("거짓 출력")
		
		System.out.println(result);
		
		System.out.println ("프로그램 종료");
	}
}