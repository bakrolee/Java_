public class StaticVariableAndConst2 {
	public static void printTest(int param) {
		param++;
		System.out.println(param);
	}
	
	public static void main(String[] args) {
		int inner = 10;
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);    // 상수값이 바뀐 것처럼 보임 (상수가 바뀐게 아니라 '값'이 복사가 되어 전달)
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);	
		
		{
			// System.out.println(inner);
			// System.out.println(TEST_SCOPE);
			
			// final int TEST_SCOPE;  당연히 안 됨
			final int BLOCK = 100;
		}
		// System.out.println(BLOCK);  // 상수라도, 블럭 안에서 선언했을 시 블럭을 벗어나면 사라짐.
	}
}