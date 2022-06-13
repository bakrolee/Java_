public class Food {
	private int cal;
	private int price;
	private int weight;
	
	public Food(int cal, int price, int weight) {
		this.cal = cal;
		this.price = price;
		this.weight = weight;
	}

	public String toString() {
		return "칼로리: " + cal + "cal, 가격: " + price + "원, 중량: " + weight + "g";
	}
}
