import java.util.Scanner;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		// 사용자 입력에 따라 학생 정보 입력할 수 있게 수정, 파라미터도 삭제함.
		System.out.println("학생의 이름, 국어 영어 수학의 점수를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public double getAverage() {
		return getSum() / 3.0;
	}
	
	public int getSum() {
		return (kor + eng + math);
	}
}
