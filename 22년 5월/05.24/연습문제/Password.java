// 사용자에게 비밀번호를 물어보고 
// 동일할 경우 통과
// 최대 3번의 기회를 줌
import java.util.*;

public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String match = "asdf1234";
		
		int i = 0;
		while (i < 3) {
			System.out.print("비밀번호를 입력해주세요: ");
			String pw = scan.nextLine();
			
			if (pw.equals(match)) {
				System.out.print("통과");
				i = 3;
			}
			else {
				i++;
				System.out.println("비밀번호가 틀렸습니다.");
				System.out.println("남은 기회 : " + (3 - i));
			}
		}
		
	}
}