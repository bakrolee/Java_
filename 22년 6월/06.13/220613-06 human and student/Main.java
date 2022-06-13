public class Main {
	public static void main(String[] args) {
//		Human hu1 = new Human("춘향", 18);
//		Human hu2 = new Human("몽룡", 21);
//		Human hu3 = new Human("사또", 50);
//		
//		System.out.println(hu1.toString());
//		System.out.println(hu2.toString());
//		System.out.println(hu3.toString());
		
		Student stu1 = new Student("명진", 21, "학생", "컴퓨터");
		Student stu2 = new Student("미현", 22, "학생", "경영");
		Student stu3 = new Student("용준", 24, "학생", "경제");
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		System.out.println(stu3.toString());
	}
}
