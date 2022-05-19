// a 와 b의 값을 서로 교환하는 프로그램.

public class Swap {
	public static void main(String[] args){
		int a = 10;
		int b = 55;
		
		int c = a;  // a값이 사라지지 않게 보관함. (없으면 두번째 연산에서 a = 55가 되어버려 원하는 결과 안 나옴)
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
	}
}