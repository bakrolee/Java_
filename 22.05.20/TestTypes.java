// 기본 자료형 변수 
// 형변환, 자료확대(자동)


public class TestTypes {
	public static void main(String[] args) {
		byte b = 10;
		short s = 100;
		int i = 1000;
		long l = 10000;  // 10000이 int형이지만 long타입 변수에 담기면서 자동적으로 확장 됨.
		
		int sum = b + s;  
		System.out.println(sum);
		/* sum을 byte와 short 타입으로 사용하려면 컴파일 에러가 뜸.
		   byte, short는 연산을 하려고 하면 int를 따라가려고 하기 때문 
		   이를 자료형의 확장이라 부름.
		   자료형의 확장은 자동적으로 일어남. */
		
		
		// 형변환 : 원래는 에러 뜨는데 무시하고 강행하기.
		// 예제1
		int i2 = (int) 1000L;           // 너무 큰 수를 작은 타입에 담을 시 손실이 일어나
		int i3 = (int) 1012313212300L;  // 에러가 뜰 수 있기에 컴파일러가 미리 경고한 것.
		System.out.println(i2);
		System.out.println(i3);  // 에러 발생. 
		
		// 예제2
		double d = 123.456;
		int i4 = (int) d;
		System.out.println(i4);   // 소숫점 부분 데이터 손실 발생.
		
		
		char a = (char) 65;
		System.out.println(a);
		
		int num = (int) a;
		System.out.println(num);
	}
}