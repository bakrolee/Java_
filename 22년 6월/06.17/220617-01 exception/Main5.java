import java.util.Scanner;

public class Main5 {
	public static  int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없음");
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// 아직 미완성
		throw new UnsupportedOperationException("내일 만들게. 아직 덜 만듬"); 
	}
	
	public static void main(String[] args) {
		myFunction();
//		try {
//			int result = divide(100, 0);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		int result = divide(100, 50); 
		
		Scanner scan = new Scanner(System.in);
		
		scan.nextInt();
		
	}
}
