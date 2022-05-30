// 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자
// getter/setter

// 자기 평균 점수를 알려줄 수 있음.

public class Student {
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student(String n, int k, int e, int m) {
		name = n;
		korScore = k;
		engScore = e;
		mathScore = m;
	}
	
	
	// 학생이름 getter/setter
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	// 국어 getter/setter
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int k) {
		korScore = k;
	}
	
	// 영어 getter/setter
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int e) {
		engScore = e;
	}
	
	// 수학 getter/setter
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int m) {
		mathScore = m;
	}
	
	
	// 점수 한꺼번에 수정
	public void setScore(int k, int e, int m) {
		korScore = k;
		engScore = e;
		mathScore = m;
	}

	// 입력값 전체 확인
	public void getStudent() {
		System.out.println(name);
		System.out.println("국어: " + korScore);
		System.out.println("영어: " + engScore);
		System.out.println("수학: " + mathScore);
	}
	
	// 평균 구하기
	public void getAvg() {
		int sum = korScore + engScore + mathScore;
		double avg = sum / 3.0;
		System.out.println("평균: " + avg);
	}
}

