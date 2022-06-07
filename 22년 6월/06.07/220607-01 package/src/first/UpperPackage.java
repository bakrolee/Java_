package first;

import first.second.AnotherClass;

public class UpperPackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22;
//		a.test = 33;  // 상위패키지에서도 접근 불가능
	}
}
