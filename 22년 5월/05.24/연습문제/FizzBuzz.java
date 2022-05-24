// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 ... 35까지 출력

// Fizz = 3의 배수
// Buzz = 5의 배수
// 3의 배수이면서 5의 배수인 15같은 경우는 Fizz Buzz같이 출력

public class FizzBuzz {
	public static void main(String[] args) {
		String a = "Fizz";
		String b = "Buzz";
		
		for (int i = 1; i <= 35; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(a + b + " ");
			}
			else if (i % 3 == 0) {
				System.out.print(a + " ");
			}
			else if (i % 5 == 0) {
				System.out.print(b + " ");
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}