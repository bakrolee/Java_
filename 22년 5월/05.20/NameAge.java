// 사용자의 나이와 이름 입력받아서
// 자기랑 같으면 true 출력하기

import java.util.Scanner;

public class NameAge {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("나이를 입력해주세요");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.println("이름을 입력해주세요");
		String name = input.nextLine();
		
		System.out.println((age == 30) && name.equals("이박로"));
	}
}