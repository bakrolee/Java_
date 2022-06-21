import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생
// 이름
// 나이

// (학생은 이름과 나이가 같으면 동일 학생임)

// 홍길동 15
// 둘리 22
// 도우너 33

// 위의 학생들을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아라.

class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
}

public class Main2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동", 15, 90));
		list.add(new Student("둘리", 22, 80));
		list.add(new Student("도우너", 33, 95));
		
		// 도우너 인덱스
		int index = list.indexOf(new Student("도우너", 33, 0)); // 점수가 달라도 찾을 수 있음 (이름, 나이가 같으면 같다고 정의했기때문)
		System.out.println(index);
		
		// 정렬
		Collections.sort(list); // 기준이 없기때문에 정렬 불가능. -> comparable 구현시키기 (Student 클래스로 가서)
		System.out.println(list);
		
		// 익명클래스를 만들어서 '나이'순으로 정렬하기
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}







