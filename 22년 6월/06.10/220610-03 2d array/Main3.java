import java.util.Arrays;
import java.util.Random;

public class Main3 {
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		return array;
	}
	
	// 각 행의 합
	public static int[] sumRow(int[][] arr) {
		int sumRow[] = new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sumRow[i] += arr[i][j];
			}
		}
		return sumRow;
	}
	
	// 각 열의 합
	public static int[] sumColumn(int[][] arr) {
		int sumColumn[] = new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sumColumn[i] += arr[j][i];
			}
		}
		return sumColumn;
	}
	
	// 숫자 7의 개수
	public static int countSeven(int[][] arr) {
		int countSeven = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 7) {
					countSeven++;
				}
			}
		}
		return countSeven;
	}

	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		System.out.println(Arrays.deepToString(randomArray));

		System.out.print("행의 합: ");
		System.out.println(Arrays.toString(sumRow(randomArray)));

		System.out.print("열의 합: ");
		System.out.println(Arrays.toString(sumColumn(randomArray)));

		System.out.printf("7의 개수: %d", countSeven(randomArray));
	}
}
