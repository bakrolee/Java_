
public class StudentBritish extends Student implements Greet {
	public StudentBritish(String name, int age) {
		super(name, age);
	}

	@Override
	public void greet() {
		System.out.println("Hello");
	}
}
