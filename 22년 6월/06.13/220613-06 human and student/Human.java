// 259 연습문제

public class Human {
	private String name;
	private int age;
	protected String profession;  // 부모클래스 변경시 자식들 다 변경해야함... 이거 주의.

//	public Human() {}

	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
