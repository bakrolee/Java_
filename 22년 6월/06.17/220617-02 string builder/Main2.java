import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "[", "]");  // 사이 사이에 파라미터 값을 넣어줌.
		sj.add("1");
		sj.add("2");
		sj.add("3");
		
		String result = sj.toString();
		System.out.println(result);
	}
}
