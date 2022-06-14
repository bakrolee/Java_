public class Main {
	public static void main(String[] args) {
		CupNoodle c1 = new CupNoodle("농심", "육개장", 1200);
		CupNoodle c2 = new CupNoodle("삼양", "육개장", 1000);
		CupNoodle c3 = new CupNoodle("농심", "육개장", 1500);
		
		System.out.println(c1.toString());
		c2.printNoodle();
		c3.printNoodle();
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
}
