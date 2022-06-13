public class Main3 {
	public static void main(String[] args) {
		Phone p = new Phone("삼성", 500000, "3g");
		System.out.println(p.toString());
		
		SmartPhone s = new SmartPhone("애플", 700000, "3g", "ios", "10.1", "8G", "Y", "Y");
		System.out.println(s.toString());
		
		
	}
}
