// 배열 사용해서 수정하기

public class ClassRoom {
	private Student[] stu;
	
	public ClassRoom(Student... stu) {
		for (int i = 0; i < stu.length; i++) {
			this.stu[i] = stu[i];
		}
	}
//  위로 수정.
//	public ClassRoom(Student stu1, Student stu2, Student stu3) {
//		this.stu1 = stu1;
//		this.stu2 = stu2;
//		this.stu3 = stu3;
//	}

	public void printNames() {
		for (int i = 0; i < stu.length; i++) {
			System.out.printf("%d번 학생: %s", (i + 1), stu[i].getName());
		}
//		System.out.println("1번 학생 : " + stu1.getName());
//		System.out.println("2번 학생 : " + stu2.getName());
//		System.out.println("3번 학생 : " + stu3.getName());
	}
	
	public int getTotalAvg() {
		return (stu1.getAverage()
				+ stu2.getAverage()
				+ stu3.getAverage()) / 3;
	}
	
	public Student getTop() {
		return max(max(stu1, stu2), stu3);

//		if (stu1.compare(stu2) && stu1.compare(stu3)) {
//			return stu1;
//		} else if (stu2.compare(stu1) && stu2.compare(stu3)) {
//			return stu2;
//		}
	}
	
	public Student max(Student left, Student right) {
		if (left.getAverage() >= right.getAverage()) {
			return left;
		} else {
			return right;
		}
	}
	
	public Student getStu1() {
		return stu1;
	}

	public void setStu1(Student stu1) {
		this.stu1 = stu1;
	}

	public Student getStu2() {
		return stu2;
	}

	public void setStu2(Student stu2) {
		this.stu2 = stu2;
	}

	public Student getStu3() {
		return stu3;
	}

	public void setStu3(Student stu3) {
		this.stu3 = stu3;
	}
}
