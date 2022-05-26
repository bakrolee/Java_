public class PrimeNumbers {
	// idea
	// 정수 1개가 소수인지 아닌지 확인할 수 있는 메소드를 만들면
	// 모든 정수에 대해서도 소수인지 아닌지 알 수 있지 않을까?
	
	public static boolean isPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}	
	
	public static void main(String[] args) {
		for (int i =2; i < 10000; i++) {  // 2 ~ 10000 중에서
			boolean result = isPrime(i);  // 소순지 알아볼거다. 참, 거짓
			if (result) {				  // 참이면
				System.out.println(i);	  // 출력
			}
		}
	}
}