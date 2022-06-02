import java.util.Scanner;

// 학급(반)
// 학생
// 학생
// 학생

// 2. 수정미션
// 학생 (이름, 국영수) 관리 프로그램
// 콘솔 입출력 가능하게
// 메소드 - 이름 목록, 평균, 1등 학생 정보를 볼 수 있어야 함 


public class Class {
	private Student student1;
	private Student student2;
	private Student student3;

	public Class(Student student1, Student student2, Student student3) {
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	} 
	
	// 기본 생성자 만듬 : 이유는 메인메소드용 
	public Class() {
	}

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음.
	public void printNameAll() {
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		System.out.println(student3.getName());
	}

// 2. 학생 3명의 총 평균을 알려줄 수 있음.
	public double getAvgSum() {
		return student1.getAverage() + student2.getAverage() + student3.getAverage();
	}

	public double getAvgAll() {
		return getAvgSum() / 3;
	}

// 3. 평균점수가 가장 높은 학생(참조)을 알려줄 수 있음. 
//	  -> 동일점수라면 1번 학생을 알려줄 것 
	private double max;
	
	public Student getAvgTop() {
		max = (student1.getAverage() >= student2.getAverage()) ? student1.getAverage() : student2.getAverage();
		max = (max >= student3.getAverage()) ? max : student3.getAverage();

		if (max == student1.getAverage()) {
			return student1;
		} else if (max == student2.getAverage()) {
			return student2;
		} else {
			return student3;
		}
	}
	
	//  관리자 프로그램
	public void manage() {
		System.out.println("관리자 프로그램입니다.");
		
		Student c1 = new Student();
		Student c2 = new Student();
		Student c3 = new Student();
		
		Class group = new Class(c1, c2, c3);
		
		while(true) {
			System.out.println("원하시는 기능을 선택해주세요. 1번: 학급 이름, 2번: 학급 평균, 3번: 1등학생정보, 4번: 프로그램 끝내기 ");
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			if (select == 1) {
				group.printNameAll();
			}
			else if (select == 2) {
				System.out.println(group.getAvgAll());
			}
			else if (select == 3) {
				System.out.println(group.getAvgTop().getName());
				System.out.printf("국어: %d, 영어: %d, 수학: %d", 
						group.getAvgTop().getKor(), group.getAvgTop().getEng(), group.getAvgTop().getMath());
				System.out.println();
			}
			else if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}
	}
	
	
}
