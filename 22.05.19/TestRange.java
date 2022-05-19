// 0 ~ 100 사이 구할 때??
// 숫자가 0이상'이고' 100이하인가?

public class TestRange {
	public static void main(String[] args) {
		int number = 33;
		
		// System.out.println(0 <= number <= 100);  컴파일 에러 나옴. (이유 : 자바는 한번에 하나씩밖에 못 물어봄)
		
		System.out.println(0 <= number);
		System.out.println(number <= 100);  
		// 값은 나옴, But 단점: 결과가 두 개가 나옴
		// 논리 연산자를 사용하면 해결 가능
		
		System.out.println("논리연산자 사용");
		System.out.println(0 <= number && number <= 100); 
		
	}
}