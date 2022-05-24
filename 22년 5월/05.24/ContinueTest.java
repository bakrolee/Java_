public class ContinueTest {
	public static void main(String[] args) {
		
		String s = "no news is good news";
		int n = 0;
		
		for (int i = 0; i < s.length(); i++) {   //  글자 길이 = lenght값 - 1
			// n이 나오는 횟수를 센다
			if (s.charAt(i) != 'n') {
				continue;
			}
			// n의 개수 하나 증가시킨다
			n++;
		}
		System.out.println("문장에서 발견된 n의 개수" + n);
	}
}