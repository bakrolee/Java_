public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student("박로", 90, 85, 100);
		lee.getStudent();
		
		lee.setScore(80, 60, 70);
		lee.getStudent();
		lee.getAvg();
		
		lee.setKorScore(88);
		lee.getStudent();
	}
}