// 제어문 (If)

public class TestIf {
	public static void main(String[] args) {
		/* 
		
		if ( 조건식(논리값) ) {  
		프로그램이 if를 만나면 조건식을 검사하게 된다. 
		조건식은 boolean식(true /false) 2개. 
		'참'이면 중괄호 안의 문장들이 실행됨. 그리고 문장이 끝나면 다시 원래대로 돌아옴.
		'거짓'이면 중괄호 안의 범위를 건너띄고 정상적인 흐름으로 흘러감.
		}
		// 예제
		if (참) {		참이면 문장1, 문장2 실행 후 문장3 실행
			문장1
			문장2
		}				거짓이면 문장3으로 바로 실행
		문장3 
		
		*/			
		
		boolean condition = false;
		if (condition) {			// if가 참일때 실행되는 문장을 than절이라고 함.
			System.out.println("조건문 블록 안 입니다.");
		}
		System.out.println("프로그램 종료");
	}
}