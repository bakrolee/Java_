import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String arrayToString(char[] target) {
		String str = "";
		for (int i = 0; i < target.length; i++) {
			str += target[i];
		}
		return str;
	}
	
	// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i;  // 이렇게 되면 조건에 맞을 때만 반환하기때문에 에러.
			}
		}
		return -1; // 인덱스는 음수가 될 수 없으므로 (못 찾았을 때의 반환값으로 적절)
	}
	
	
	public static void main(String[] args) {
		char[] hello = { 'H', 'e', 'l', 'l', 'o' };
		
		printArray(hello);
//		for (int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
		
		String result1 = arrayToString(hello);  // 직접 만든 메소드
		
		String result2 = Arrays.toString(hello);  // 자바에서 만들어놓은 메소드 (원소들을 문자열로 보여줌)
		System.out.println(result2);
		
		
		// 위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("찾았다: " + i);
//			}
//		}
	}
}
