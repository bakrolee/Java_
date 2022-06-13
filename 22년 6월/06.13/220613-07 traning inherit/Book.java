public class Book {
	private String title;
	private int pageNumber;
	private String author;
	
	public Book(String title, int pageNumber, String author) {
		this.title = title;
		this.pageNumber = pageNumber;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void printBook() {
		System.out.printf("제목: %s, 페이지수: %d, 저자: %s", 
						getTitle(), getPageNumber(), getAuthor());
	}
}
