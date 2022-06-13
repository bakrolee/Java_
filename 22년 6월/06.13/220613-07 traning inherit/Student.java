public class Student {
	private String name;
	private int studentID;
	private String major;
	private int grade;
	private int credit;
	
	public Student(String name, int studentID, String major, int grade, int credit) {
		this.name = name;
		this.studentID = studentID;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	
	public String toString() {
		return "이름: " + name + ", 학번: " + studentID + ", 소속학과: " + major + ", 학년: " + grade
				+ ", 이수학점: " + credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
}
