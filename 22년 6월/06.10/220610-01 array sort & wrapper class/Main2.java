public class Main2 {
	public static void main(String[] args) {
		int number = 22;
		// Wrapper Class
//		Byte b;  // 참조형 변수로 만들어 줌
//		Short
//		Integer
//		Long
//		Float
//		Double
//		Character
//		Boolean
		Integer i = new Integer(10);  // deprecated : 곧 없어질 생성자
		Integer i2 = Integer.valueOf(500);  // boxing.
		int primitiveInt = i2.intValue();  //  unboxing. 다시 원시타입으로 알려줌.(int)
		
		Integer auto = 100; // 자동으로 boxing이 일어나게 됨. (편리성을 위해)
		int un = auto; // auto-unboixng
		
		Integer value = Integer.valueOf("5959"); // 문자열에서 숫자만 잘라내어 '인트형 참조'를 얻어낼 수 있음.
		int result = Integer.valueOf("1234");
		
		Integer.parseInt("90");  // int형으로 반환
	}
}
