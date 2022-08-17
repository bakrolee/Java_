package kr.co.greenart;

public class BoardArticle {
	private int id;
	// 제목
	private String title;
	// 내용
	private String contetnt;
	
	// 생성자
	public BoardArticle(int id, String title, String contetnt) {
		super();
		this.id = id;
		this.title = title;
		this.contetnt = contetnt;
	}
	
	// 게터,세터
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContetnt() {
		return contetnt;
	}
	public void setContetnt(String contetnt) {
		this.contetnt = contetnt;
	}

	@Override
	public String toString() {
		return "BoardArticle [id=" + id + ", title=" + title + ", contetnt=" + contetnt + "]";
	}
}
