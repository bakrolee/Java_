import java.util.Scanner;

// p.237 2번

// 사용자 입력값(정수) 10개
// 이때  1 ~ 100 사이로 범위 지정
// 그리고 배열로 묶기 

// 입력값이 10개의 단위 중 어디에 들어가는지 
// 각각 들어갈 때마다 카운트 후
// 카운드 될 때마다 별 추가해서 최종 출력하기

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Range10 r = new Range10();
		
		int[] user = new int[10];
		
		int i = 0;
		while (i < user.length) {
			int num = scan.nextInt();
			if (num < 1 || num > 100) {
				continue;
			}
			else {
				user[i] = num;
				i++;
			}
		}
		
		r.count10(user);
	}
}
