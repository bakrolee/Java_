public class UnderGraduate extends Student {
	private String clubName;

	public UnderGraduate(String name, int studentID, String major, int grade, int credit, String clubName) {
		super(name, studentID, major, grade, credit);
		this.clubName = clubName;
	}

	@Override
	public String toString() {
		return super.toString() + ", 동아리명: " + clubName;
	}
	
	
}
