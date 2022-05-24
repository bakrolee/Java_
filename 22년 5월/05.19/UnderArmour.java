// 사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// 그렇지 않으면 false

import java.util.Scanner;

public class UnderArmour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("벤치 : ");
		int bench = input.nextInt();
		System.out.print("스쿼트 : ");
		int squat = input.nextInt();
		System.out.print("데드 : ");
		int dead = input.nextInt();
		
		System.out.print("언더아머 입을 수 있나요? " + (bench + squat + dead >= 500));
	}
}