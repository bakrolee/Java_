import java.util.*;

public class Averager {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		boolean go = true;
		while (go) {
			System.out.print("점수를 입력하시오: ");
			int grade = scan.nextInt();
			
			go = (grade >= 0);
			// if (grade < 0) {
				// break;
			// }
			
			total += grade;
			count++;
		}
		System.out.println("평균은 " + total / count);
	}
}