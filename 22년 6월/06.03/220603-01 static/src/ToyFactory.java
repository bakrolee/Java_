public class ToyFactory {
	// static 쓸 때?
	// 상태가 필요없고 기능만 사용할 때
	public static Toy makeToy1() {
		return new Toy("처키인형", 10000);
	}
	
	// 상태를 표현할 때 (객체)
	// eg. 공장의 생산지가 여러 군데고, 그에따라 달리 표현하겠다.
	String location;
	
	public ToyFactory(String location) {
		this.location = location;
	}

	public Toy makeToy2() {
		return new Toy("처키인형, 생산지" + location, 10000);
	}
}
