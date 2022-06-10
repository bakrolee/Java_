import java.util.Arrays;

public class Main2 {
	static int[] makeSquare(int number) {
		int[] temp = new int[5];
		temp[0] = number;
		int squ = number;
		for (int i = 1; i < temp.length; i++) {
			squ *= number;
			temp[i] = squ;
		}
		return temp;
	}

	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에
		// 모든 원소 출력해보기
		// 예> 2 4 8 16 32 ...
		// 3 9 27 81...

		int[] squareTwo = makeSquare(2);
//		System.out.println(Arrays.toString(squareTwo));

		int[] squareThree = makeSquare(3);
		int[] squareFour = makeSquare(4);
		int[] squareFive = makeSquare(5);

		int[][] arr = new int[4][5];
		arr[0] = squareTwo;
		arr[1] = squareThree;
		arr[2] = squareFour;
		arr[3] = squareFive;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		//
		int[][] arr2 = new int[4][5];
		for (int i = 0; i < arr2.length; i++) {
			int n = 1;
			for (int j = 0; j < arr2[i].length; j++) {
				n *= i + 2;
				arr2[i][j] = n;
			}
		}
		
		// deep~
		// 2차원 배열이라도 원소값 보여줌.
		System.out.println(Arrays.deepToString(arr));  
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println(arr == arr2);
		System.out.println(Arrays.equals(arr, arr2));  // 각 배열의 참조값이 다르기 때문에 false
		System.out.println(Arrays.deepEquals(arr, arr2)); // 각 원소들의 값과 길이까지 깊게 들어가서 확인해서 비교하므로 true
	}
}
