import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\w{3,}"); // 3자 이상 영문자
		Pattern p2 = Pattern.compile("\\w+"); // 1글자 이상
		
		Pattern p3 = Pattern.compile("\\d"); // 숫자
		
		Pattern p4 = Pattern.compile("\\s"); // 공잭
		
	}
}
