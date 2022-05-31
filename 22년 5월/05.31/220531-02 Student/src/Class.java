// 학급(반)
// 학생
// 학생
// 학생


public class Class {
	private Student name1;
	private Student name2;
	private Student name3;
	private double max;

	public Class(Student name1, Student name2, Student name3) {
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
	}

	// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음.
	public void nameAll() {
		System.out.println(name1.getName());
		System.out.println(name2.getName());
		System.out.println(name3.getName());
	}

	// 2. 학생 3명의 총 평균을 알려줄 수 있음.
	public double getAvgSum() {
		return name1.getAverage() + name2.getAverage() + name3.getAverage();
	}

	public double getAvgAll() {
		return getAvgSum() / 3;
	}

	// 3. 평균점수가 가장 높은 학생(참조)을 알려줄 수 있음. 
	//	  -> 동일점수라면 1번 학생을 알려줄 것 
	public Student getAvgTop() {
		max = (name1.getAverage() >= name2.getAverage()) ? name1.getAverage() : name2.getAverage();
		max = (max >= name3.getAverage()) ? max : name3.getAverage();

		if (max == name1.getAverage()) {
			return name1;
		} else if (max == name2.getAverage()) {
			return name2;
		} else {
			return name3;
		}
	}
}
