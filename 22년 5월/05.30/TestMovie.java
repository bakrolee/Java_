public class TestMovie {
	public static void main(String[] args) {
		Movie m = new Movie(
						"새영화"
						, 7.5
						, "새감독"
						, 2022);
						
		System.out.println(m.title);
		System.out.println(m.score);
		System.out.println(m.director);
		System.out.println(m.publishYear);
	}
}