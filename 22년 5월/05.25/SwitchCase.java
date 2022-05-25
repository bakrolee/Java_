// SwitchCase문
// 새로운 개념 (if문이랑 비슷함)
// switch() 
//    case1, case2, ... case#
// 이때 case# -> #에는 숫자, 문자 다 올 수 있음.
// 이때 switch (i) -> i와 #이 같으면 해당 case에 해당하는 문장을 실행함.


public class SwitchCase {
	public static void main(String[] args) {
		int i = 2;
		
		// 지금까지 배워왔던 방식
		/* if (i == 1) {
			
		} else if (i == 2) {
			
			
		} else if (i == 3) {
			
		} else {
			
		} */
		
		
		switch (i) {
			case 1:
			System.out.println("일");
			break; 
			case 2:
			System.out.println("이");
			break;	// 브레이크가 없으면 아래쪽으로 쭉 흘러가기 때문에 내가 원하는 결과값만 출력할 수 없음.
			case 3:
			System.out.println("삼");
			break;
			default:	// 해당하는 case를 찾을 수 없을 때 default값을 출력함.  eg. i가 5이면 default값 출력.
						// default값은 없어도 됨.  eg. i가 5이면 아무것도 실행 안 됨.
			System.out.println("일이삼 아님");
		}
	}
}