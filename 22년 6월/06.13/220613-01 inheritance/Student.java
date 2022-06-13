public class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);  // super는 언제나 생성자의 첫문장이어야 함!
		this.score = score;
	}

	public int getScore() {
		return score;
	}
}
