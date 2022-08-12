import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";
		
//		Pattern p = Pattern.compile("[A-Z]{9}");
//		Matcher m = p.matcher(line2);
//		
//		System.out.println(m.matches());
		
//		Pattern p = Pattern.compile("[0-9a-z]{6}");
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());
		
		
		// id는 영소문자 또는 숫자로 이루어져야하고 최소 6자 최대 10자임 (영문자로 시작해야합니다.)
		Scanner scan = new Scanner(System.in);
		System.out.println("id 입력");
		String id = scan.nextLine();
		
		Pattern p = Pattern.compile("[a-z][a-z0-9]{5,9}");
		Matcher m = p.matcher(id);
		
		if (!m.matches()) {
			System.out.println("잘못된 입력입니다.");
		} else {
			System.out.println("ok");
		}
		
		
		// 올바른 전화번호 (010-####-####)
		String regex = "010-[0-9]{4}-[0-9]{4}";
		
		Pattern p2 = Pattern.compile(regex);
		System.out.println(p2.matcher("010-1234-a578").matches());
		
	}
}


















