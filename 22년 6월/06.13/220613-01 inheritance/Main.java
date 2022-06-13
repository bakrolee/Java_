// #. 상속

// 학생
// 이름
// 나이
// 점수

// 이름 알려주기
// 점수 알려주기


// 작가
// 이름
// 나이
// 작품 목록

// 이름 알려주기
// 작품 목록 알려주기
public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		Student s = new Student("학생이름", 17, 90);
		System.out.println(s.getName());  // 부모 클래스의 특징 - 메소드
		System.out.println(s.getScore());
		
		Author a = new Author("작가이름", 30, "반지의길");
		System.out.println(a.getName());  
		System.out.println(a.getBookList());
	}
}
