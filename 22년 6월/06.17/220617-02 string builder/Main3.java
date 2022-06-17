import java.util.StringTokenizer;

// carrot 출력하기

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";

		// self
		String[] arr = new String[4];
		StringBuilder sb = new StringBuilder(longLine);
		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				int spaceIndex = sb.indexOf(" ");
				arr[i] = sb.substring(0, spaceIndex);
				sb.replace(0, spaceIndex + 1, "");
			}
			else {
				arr[i] = sb.toString();
			}
		}
		System.out.println(arr[2]);

		
		// 문자열 잘라내는 클래스
		StringTokenizer st = new StringTokenizer(longLine, " "); // 왼쪽이 대상, 오른쪽 기준(잘라낼)
//		st.hasMoreTokens(); // 잘라낼 문자열 있는지 확인
//		String a = st.nextToken(); // " " -> 기준으로 해서 맨 앞에서부터 하나씩 가져옴.
		
		int i = 0;
		while (st.hasMoreTokens()) {
			String result = st.nextToken();
			if (i == 2) {
				System.out.println(result);
			}
			i++;
		}
		
		// split
		String[] split = longLine.split(" ");
		System.out.println(split[2]); 
	}
}
