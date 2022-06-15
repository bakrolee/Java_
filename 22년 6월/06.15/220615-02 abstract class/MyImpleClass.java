public final class MyImpleClass extends MySubClass {
	@Override
	public void myMethod() {
		System.out.println("새롭게 재정의를 하였습니다.");
	}
	
	@Override
	public void myMethod2() {
		System.out.println("마이메소드2 오버라이드 구현");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
//		m.myMethod2();  // 이 메소드는 Sub에 존재하기 때문
		
		MySubClass sub = (MySubClass) m;
		sub.myMethod2();
		sub.myMethod();  // 손자 클래스에서 새롭게 재정의 된 게 (자식 클래스 메소드를)덮어씌움. - 이유 : 부모도 추상클래스니깐
	}
}
