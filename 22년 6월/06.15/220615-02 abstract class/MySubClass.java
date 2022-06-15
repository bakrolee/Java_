public abstract class MySubClass extends MyClass {
	
	@Override  // 여기서 정의했으니 자식 메소드에서 재정의 안 해도 됨.
	public void myMethod() {
		System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	public abstract void myMethod2();
}
