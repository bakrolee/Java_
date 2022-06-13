public class Graduate extends Student {
	private String assistantType;
	private int scholarshipRate;
	
	public Graduate(String name, int studentID, String major, int grade, int credit, String assistantType,
			int scholarshipRate) {
		super(name, studentID, major, grade, credit);
		this.assistantType = assistantType;
		this.scholarshipRate = scholarshipRate;
	}

	@Override
	public String toString() {
		return super.toString() + "조교 유형: " + assistantType + ", 장학금 비율: " + scholarshipRate;
	} 
}
