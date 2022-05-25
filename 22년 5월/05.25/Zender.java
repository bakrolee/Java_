// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxx-1xxxxxx  -> 남성

import java.util.*;

public class Zender {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		String code = scan.nextLine();  // 한줄로 주민번호 입력해야되기 때문에 문자열로
		
		if (code.length() == 14) {
			char c = code.charAt(7);  // 내가 판단할 위치의 문자열 - 1,3이면 남성 / 2,4면 여성으로 출력해야 함.
			switch (c) {
				case '1':		case '3':   // "" 쓰면 안됨 (주의) 
											// char 타입이라서 '' 써야 됨
					System.out.print("남성입니다.");
					break;
				case '2':		case '4':
					System.out.print("여성입니다.");
					break;
				default:
					System.out.print("잘못 입력"); 
					break;
			}
		} else {
			System.out.print("잘못 입력"); 
		}
	}
}