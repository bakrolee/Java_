// 가장 많이 쓰는 연산
// 1씩 증가 or 감소하는

public class AutoInc {
	public static void main(String[] args) {
		/* 
		복합 대입 연산자 += -= 등...
		a += 1;  // 11
		a -= 1;  // 10 
		
		/* 증감연산자
		a++;
		a++;  // a에서 1만큼 더해라.
		a++;
		a--;  // a에서 1만큼 빼라.
		System.out.println(a);
		 
		
		int a = 10;
		System.out.println(a++);  // 문장을 먼저 수행 (a를 출력하라), 다음 줄에 1더하게 됨.
		System.out.println(a);
		
		int b = 10;
		System.out.println(++b);  // 먼저 1 더하고, 더한 값 출력.
		
		이렇게 하면 헷갈리니 아래 방식으로 표기할 것!
		 */
		 
		int a = 10;
		System.out.println(a);
		a++;
	}
}