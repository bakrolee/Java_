public class Phone {
	private String company;
	private int price;
	private String type;
	
	public Phone(String company, int price, String type) {
		this.company = company;
		this.price = price;
		this.type = type;
	}

	public String toString() {
		return "제조사: " + company + ", 가격: " + price + "원, 통신타입: " + type;
	}
}
