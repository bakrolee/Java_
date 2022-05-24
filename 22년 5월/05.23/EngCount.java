// 사용자가 입력한 영단어에서 모음(a e i o u) 몇개인지 출력

import java.util.Scanner;

public class EngCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영단어를 입력하세요: ");
		
		// 모음 세기
		// asienl -> 앞에서부터 한글자씩 a, e, i, o, u 와 == 인지 ||를 사용해서 조건을 건다.
		// 한글자씩 비교할 때 반복문 사용!
		// 조건에서 true이면 count++ 하기
		
		/* 
		String eng = scan.nextLine();
		int count = 0;
		for (int i = 0; i < eng.length(); i++) {
			if (eng.charAt(i) == 'a' || eng.charAt(i) == 'e' 
			 || eng.charAt(i) == 'i' || eng.charAt(i) == 'o' 
			 || eng.charAt(i) == 'u') {
					count++;
				}
		} 
		*/
		
		// 쌤풀이
		String line = scan.nextLine();
		
		int length = line.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			char c = line.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		
		System.out.print("모음의 개수: " + count); 
	}
}


