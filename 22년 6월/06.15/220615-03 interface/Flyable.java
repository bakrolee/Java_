public interface Flyable {
	void fly();
}

class Animal {}
class Bird extends Animal {}

class Eagle extends Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("독수리가 푸드득 푸드득 납니다.");
	}
}
class Penguin extends Bird {}

class FlyingFish extends Animal implements Flyable {
	@Override
	public void fly() {
		System.out.println("날치가 물위로 남");
	}
}

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("비행기가 남");
	}
}