package first.second;

public class SamePackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22;
		a.test = 33;  // 같은 패키지 내에서는 접근 가능
	}
}
