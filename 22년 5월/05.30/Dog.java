// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이

// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
// 각 필드의 public한 getter/setter를 작성해보시오.

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는 생성자
	public Dog(String n, String b, int a) {
		name = n;
		breed = b;
		age = a;
	}
	
	// 강아지 이름, 종을 전달받은 값으로 초기화하고
	// 나이는 1살로 초기화 할 수 있는 생성자
	public Dog(String n, String b) {
		this(n, b, 1);
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 출력 메소드
	public void printAll() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
	}
}