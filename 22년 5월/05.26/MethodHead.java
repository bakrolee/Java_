public class MethodHead {
	// 정수 두 개를 전달받아 왼쪽이 큰지, 오른쪽이 큰지 혹은 같은지를 알고 싶음.
	
	// 1. int compare (int, int) -> 양수(왼쪽), 음수(오른쪽), 0(같다)
	
	// public static int compare(int left, int right) {
		// return left - right;
	// }
	
	
	// 2. char compare (int, int) -> 'L'(왼쪽), 'R'(오른쪽), 'E'(같다)
	
	public static char compare(int left, int right) {
		if (left > right) {
			return 'L';
		} else if (left < right) {
			return 'R';
		} else {
			return 'E';
		}
	}
	
	public static void main(String[] args) {
		char result = compare(300, 300);
		System.out.println(result);
	}
}