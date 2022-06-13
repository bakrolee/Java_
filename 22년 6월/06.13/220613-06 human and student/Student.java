public class Student extends Human {
	private String major;
	
//	public Student() {}

	public Student(String name, int age, String profession, String major) {
		super(name, age, profession);
		this.major = major;
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
//	@Override
//	public String toString() {
//		Human h = new Human(getName(), getAge());
//		return h.toString() + ", 전공: " + major;  // 부모 메소드 바로 호출 가능?
//	}
	
	@Override
	public String toString() {
		return super.toString() + ", 전공: " + major;
	}
}
