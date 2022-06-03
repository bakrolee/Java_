public class TestToy {
	public static void main(String[] args) {
		Toy toy1 = new Toy("새 장난감", 5000);
		
//		Toy chucky = ToyFactory.makeToy1();
		ToyFactory fac = new ToyFactory("부산");
		Toy chucky = fac.makeToy2();
		
	}

}
