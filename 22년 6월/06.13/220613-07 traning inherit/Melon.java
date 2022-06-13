public class Melon extends Food {
	private String farm;

	public Melon(int cal, int price, int weight, String farm) {
		super(cal, price, weight);
		this.farm = farm;
	}

	@Override
	public String toString() {
		return super.toString() + ", 멜론 경작 농원: " + farm;
	}
}
