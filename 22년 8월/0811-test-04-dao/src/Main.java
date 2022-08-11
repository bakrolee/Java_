import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String line = "This is a book.";
		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher(line); // 내가 검사하고자 하는 문장 -> Pattern객체로 바꿔줌.
		
		System.out.println(m.lookingAt()); // 패턴과 시작부분이 같으면 true
		
		boolean find = m.find();	// 찾고자하는 정규표현식을 찾으면 true
		if (find) {
			System.out.println(m.start()); // 일치한 문자 시작위치 (index 0부터)
			System.out.println(m.end()); // 일치한 부분 직후 위치
		}
		
		find = m.find();
		if (find) {
			System.out.println(m.start());
			System.out.println(m.end()); 
		}
		
		find = m.find();
		if (!find) {
			System.out.println("없음");
		}
	}
}
