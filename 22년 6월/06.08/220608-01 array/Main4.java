import java.util.Arrays;

public class Main4 {
	// 1. 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	public static int[] concatArray(int[] left, int[] right) {
		int sum = left.length + right.length;
		int[] com = new int[sum];
		for (int i = 0; i < left.length; i++) {
			com[i] = left[i];
		} 
		for (int i = 0; i < right.length; i++) {
			com[i + left.length] = right[i];
		}
		return com;
	}
	
	// 2. 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [11, 13, 15, 13, 14]
	public static int[] sumArray(int[] left, int[] right) {
//		int length = left.length >= right.length ? left.length : right.length;
//		int[] result = new int[length];
//		
//		if (left.length > right.length) {
//			for (int i = 0; i < right.length; i++) {
//				result[i] = left[i] + right[i];
//			}
//			for (int i = right.length; i < left.length; i++) {
//				result[i] = left[i];
//			}
//		} else if (left.length < right.length) {
//			for (int i = 0; i < left.length; i++) {
//				result[i] = left[i] + right[i];
//			}
//			for (int i = left.length; i < right.length; i++) {
//				result[i] = right[i];
//			}
//		} else {
//			for (int i = 0; i < left.length; i++) {
//				result[i] = left[i] + right[i];
//			}
//		}
//		return result;
		
		int[] copy;
		int[] target;
		
		if (left.length > right.length) {
			copy = copy(left, 0);
			target = right;
		} else {
			copy = copy(right, 0);
			target = left;
		}
		
		for (int i = 0; i < target.length; i++) {
			copy[i] += target[i];
		}
		
		return copy;
	}
	
	
	public static int[] copy(int[] arr, int newLength) {
		int[] larger = new int[arr.length + newLength];
		for (int i = 0; i < arr.length; i ++) {
			larger[i] = arr[i];
		}
		return larger;
	}
			
	public static void main(String[] args) {
		// int형 배열 -> 원소값 설정 안했을 때 -> 0으로 초기화
//		int[] arr = new int[3];
//		System.out.println(arr[0]);  
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		
		// 배열 초기화 후, 공간을 늘리고 싶을때?
//		int[] arr = { 10, 20, 30 };
//		int[] larger = new int[arr.length + 2];  // 원본은 수정이 불가능하니 복사본을 만든 것
//		
//		for (int i = 0; i < arr.length; i++) {
//			larger[i] = arr[i];
//		}
//		System.out.println(Arrays.toString(larger));
		
		
		// 1.
		int[] arr = { 10, 20, 30, 40, 50};
		int[] arr2 = { 55, 60, 70, 33 };
		int[] test = concatArray(arr, arr2);
		System.out.println(Arrays.toString(test));
		
		// 2.
		int[] test2 = sumArray(arr, arr2);
		System.out.println(Arrays.toString(test2));
	}
}
