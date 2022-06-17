public class Main {
	public static void main(String[] args) {
		// 문제점
		String str = "원본 문자열";
		String other = "다른 문자열";
		String origin = "원본 문자열";  // str과 같은 인스턴스를 참조하게끔 함. (공간 효율때문에 자동으로 해줌)
		
		String concat = str + other;  // 합연산을 하기 때문에, 새 인스턴스를 만들 수밖에 없음.
		System.out.println(concat);
//		System.out.println("원본 문자열다른 문자열" == concat);  // 참조가 다르기때문
		System.out.println(str == origin);  // 참조를 같기때문.
		
		
		// 해결책 : StringBuilder
		StringBuilder sb = new StringBuilder("원본"); 
		sb.append(",One=").append(1).append(",DoubleValue=").append(255.0);
		System.out.println(sb);
		
//		System.out.println(sb.reverse());
		
		sb.setCharAt(0, 'Q');
		sb.insert(0, "시작");
		
		
		StringBuffer sbuffer; 
		
	}
}
