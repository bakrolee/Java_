
public class StudentKorean extends Student implements Greet {
	public StudentKorean(String name, int age) {
		super(name, age);
	}

	@Override
	public void greet() {
		System.out.println("안녕");
	}
}
