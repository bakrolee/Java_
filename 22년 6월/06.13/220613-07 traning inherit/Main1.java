public class Main1 {
	public static void main(String[] args) {
		Book b = new Book("바람", 200, "한국인");
		b.printBook();
		System.out.println();
		
		Magazine m = new Magazine("기적", 150, "민국", "22/06/13");
		m.printMagazine();
	}
}
