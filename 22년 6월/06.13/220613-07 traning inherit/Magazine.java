public class Magazine extends Book {
	private String publishDate;

	public Magazine(String title, int pageNumber, String author, String publishDate) {
		super(title, pageNumber, author);
		this.publishDate = publishDate;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	
	public void printMagazine() {
		super.printBook();
		System.out.printf(", 발매일: %s", getPublishDate());
	}
	
}
