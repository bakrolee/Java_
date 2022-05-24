// 2의 제곱 수를 32개 나열하고 결과값을 확인해보세요
// 2 4 8 16 32 64 128 256 ...

public class Num2 {
	public static void main(String[] args) {
		// 제곱수를 구하려면
		// 2, 2*2, 2*2*2, 2*2*2*2, ....
		// 1   2     3       4           32
		// 그러려면 결과값에 *2를 계속 추가해야함.
		
		long x = 2L;
		for (int i = 1; i <= 32; i++) {
			System.out.println(x);
			x = x * 2;
		}
	}
}