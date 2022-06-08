
public class Airplain {
	int[] space = new int[10];

	public void reservation(int n) {
		if (space[n] == 1) {
			System.out.println("이미 예약된 좌석입니다.");
		} else if (space[n] == 0) {
			space[n] = 1;
			System.out.println("예약되었습니다.");
		}
		
	}
	
	public void cheackR(int[] target) {
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();
	}
}
