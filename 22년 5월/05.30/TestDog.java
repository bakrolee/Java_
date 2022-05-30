public class TestDog {
	public static void main(String[] args) {
		Dog d = new Dog("갱", "푸들", 3);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getAge());
		
		d.setName("왕");
		System.out.println(d.getName());
		
		Dog d2 = new Dog("돌돌", "리트리버");
		d2.printAll();
	}
}