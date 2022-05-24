// 사용자가 입력한 원하는 반복 만큼만.
// 0부터 1씩 증가하는 수를 출력하기.

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("어디까지 반복? ");
		int a = input.nextInt();
		
		int i = 0;
		while (i < a) {
			System.out.println(i);
			i++;
		}
	}
}