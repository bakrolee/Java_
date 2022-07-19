
public class Book {
	private int bookId;
	private String title;
	private int price;
	
	public Book(int bookId, String title, int price) {
		super();
		this.title = title;
		this.price = price;
		this.bookId = bookId;
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " bookId:" + bookId + ", 제목:" + title + ", 가격:" + price + "\n";
	}
}
