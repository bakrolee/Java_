public class TestStudent {
	public static void main(String[] args) {
		
//		Student student1 = new Student("홍길동", 100, 90, 80);
//		double avg1 = student1.getAverage();
//		System.out.println(avg1);
//		
//		Student student2 = new Student("둘리", 60, 70, 80);
//		Student student3 = new Student("도우너");
//		
//		double avg2 = student2.getAverage();
//		double avg3 = student3.getAverage();
//		
//		double sum = avg1 + avg2 + avg3;
//		double totalAvg = sum / 3.0;
		
//		System.out.println(totalAvg);
		
		
		Student c1 = new Student("홍길동", 90, 100, 80);
		Student c2 = new Student("둘리", 80, 50, 70);
		Student c3 = new Student("도우너", 50, 30, 10);
		
		Class group = new Class(c1, c2, c3);
		
		group.nameAll();
		
		System.out.println(group.getAvgAll());
		
		System.out.println(group.getAvgTop().getName());
	}
}


















