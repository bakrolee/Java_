// for each문

// 가변길이 파라미터 (...)

public class Main6 {
	public static void someMethod(int... arr) {
		for (int number : arr) {
			System.out.println(number);
		}
	}
	
	public static int sum(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

//		for (int number : arr) {
//			arr[1] = 1;
//			arr[2] = 2;
//			arr[0] = 0;  // 이건 씹힘
//			System.out.println(number);
//		}

//		someMethod(arr);
//		someMethod(new int[] { 20, 30, 40, 50, 60 });
//		System.out.println("---");
//		someMethod(new int[] { 4, 5, 6 });
//		System.out.println("종료");
	
		someMethod(40, 50, 60, 70, 80);
		
		int result = sum(10, 20, 3, 4, 5, 123, 232);
		System.out.println(result);
		
	}
}
