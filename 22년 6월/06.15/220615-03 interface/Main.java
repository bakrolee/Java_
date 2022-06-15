public class Main {
	public static void main(String[] args) {
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		Flyable f = e; // 독수리는 날 수 있으므로 인터페이스로 참조할 수 있다.
		
		f.fly();
		
		Flyable p = new Plane();
		Flyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}
}
