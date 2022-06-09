// 배열 사용해서 수정

import java.util.Scanner;

public class StudentManage {
	private ClassRoom room;
	
	public Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 정보. 이름, 국영수 순으로 입력해주세요.");
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		return new Student(name, kor, eng, math);
	}
	
	public Student[] numberOfClass(int n) {
		Student[] stu = new Student[n]; 
		for (int i = 0; i < stu.length; i++) {
			stu[i] = inputStudent();
		}
		return stu;
	}
	
	public void start() {
//		Student stu1 = inputStudent();
//		Student stu2 = inputStudent();
//		Student stu3 = inputStudent();
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 총원을 입력해주세요.");
		int n = scan.nextInt();
		
		room = new ClassRoom(numberOfClass(n));
		
		System.out.println("메뉴");
		System.out.println("1.학생 이름 보기  2.총 평균 보기  3.1등 보기  4.");
		int number = scan.nextInt();
		
		if (number == 1) {
			room.printNames();
		} else if (number == 2) {
			System.out.println("총 평균 : " + room.getTotalAvg());
		} else if (number == 3) {
			Student top = room.getTop();
			System.out.println(top.getName());
			System.out.println(top.getAverage());
		}
	}
}
