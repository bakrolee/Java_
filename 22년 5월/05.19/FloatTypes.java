public class FloatTypes{
	public static void main(String[] args){
		float f = 123.456F;  // java는 보통 실수는 double로 인식하므로 F붙여줌.
		double d = 7777.8888;
		
		// float sum = f + d;  // 더 큰 범위로 따라가려고 하기에 에러 뜸.
		// double sum = f + d;
		
		int i = 10000;
		// int sum = i + f;   // 정수와 실수의 결합은 실수를 따라가려함. 
		// float sum = i + f;    //  같은 비트수를 가지고 있더라도 표현할 수 있는 범위는 플롯이 더 큼.
		
		long l = 100000L;
		float sum = l + f;    // long이라도 float이 표현범위(소숫점 아래)가 더 넓으므로 플롯을 따라감.
		
		float one = 0.1F;    // 정확한 값이 아니라 근사값이기에 오차가 있음.
		System.out.printf("%.15f", one * 22);  // %.숫자 - 숫자만큼 자릿수를 나타냄
	}
}