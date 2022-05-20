// 문자열과 Scanner

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt(); // 주의 : 스캐너 사용시 nextInt 다음에 nextLine 순서로 그냥 못씀
								// 이유 : nextInt는 입력시 정수만 가져옴.
		                        //       뒤에 enter친 것 = '\n'가 남아있기때문. (순서 바뀌면 상관없음)
		System.out.println("한줄을 입력하세요");
		
		scan.nextLine();  // 해결법 : 얘를 중간에 넣어주면 됨.
		
		String line = scan.nextLine();
		System.out.println(line);
	}
}