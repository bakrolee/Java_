// 사용자의 학점
// 점수를 입력받아서
// 90점 이상 : A
// 90미만 80점이상 : B
// 80점미만 70점이상 : C
// 70점미만 60점이상 : D
// 60점미만 : F

import java.util.Scanner;

public class UniScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int i = input.nextInt();
		
		String grade;
		if (i >= 90) {
			grade = "A";
		} else if (i >= 80) {
			grade = "B";
		} else if (i >= 70) {
			grade = "C";
		} else if (i >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.print(grade + "학점");
	}
}
