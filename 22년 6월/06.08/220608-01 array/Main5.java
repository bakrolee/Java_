import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int[] copy = Arrays.copyOf(arr, 3); // 배열 복사, 뒤는 배열 길이 (원본보다 작거나 크면 그 길이만큼 생성)
		int[] temp = { 40, 50, 60 };

		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy));

		int[] another = Arrays.copyOfRange(temp, 0, 2); // 0번째에서 2개
		System.out.println(Arrays.toString(another));

		// 원소값 전체를 똑같은 값으로 초기화 하기
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));
	}
}
