// 형변화
// 확대 : 자동으로 되므로 신경 안써도 됨
// 축소 : 이때 오차 감안하고 강행할 때 형변화 사용
// 형변화는 문자와 숫자간 교차는 안 됨.

public class TypeConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;
		System.out.println(f);
		
		f = (double) 5 / 4;
		System.out.println(f);
		f = 5 / (double) 4;
		System.out.println(f);
		f = (double) 5 / (double) 4;
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8;  // 현변화가 먼저 일어난 후 연산.
		System.out.println(i);
		i = (int) (1.3 + 1.8); 
		System.out.println(i);
	}
}