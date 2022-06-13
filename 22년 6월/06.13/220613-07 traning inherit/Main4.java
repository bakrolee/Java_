public class Main4 {
	public static void main(String[] args) {
		Student s = new Student("학생", 20153577, "컴공", 3, 137);
		System.out.println(s.toString());
		
		UnderGraduate u = new UnderGraduate("재학생", 20201155, "실용음악", 2, 138, "침대축구");
		System.out.println(u.toString());
		
		Graduate g = new Graduate("대학원생", 20128582, "사학과", 4, 132, "연구조교", 0);
		System.out.println(g.toString());
	}
}
