// 사용자에게 초단위의 시간을 입력받아
// 시간 분 초로 변환을 하는 프로그램

// 입력예) 3666
// 출력예) 1시간 1분 6초

import java.util.Scanner;

public class SecToTime {
	public static void main(String[] args){
		// 3666 
		// -> 나누기 3600을 하면 1시간 단위가 나옴/
		// -> 위의 나머지에서 나누기 60을 하면 1분단위가 나옴/ 
		// -> 나머지 값은 초로 주면 됨
		Scanner input = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요: ");
		int x = input.nextInt();
		
		int h = x / 3600;
		int m = (x % 3600) / 60;
		int s = (x % 3600) % 60;
		
		System.out.println("\n변환 \n");
		System.out.print(h + "시간" + m +"분" + s +"초");
	}
}