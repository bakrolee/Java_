public class Animal {
	public void sound() {
//		System.out.println("멍멍"); // 이렇게 쓰면 cat과 맞지는 않음.
		System.out.println("동물은 제 각각 소리낸다.");
	}
}

class Dog extends Animal {
	@Override	// 실수 방지용! 무조건 적어둘 것
	public void sound() {	
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	// method override
	public void sound() {
		System.out.println("냐옹");
	}
}