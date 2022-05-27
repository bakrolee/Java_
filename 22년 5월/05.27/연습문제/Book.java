// 1번
// 책 클래스 (class book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콘솔에 출력 가능(printAll)



public class Book {
	String title;
	String author;
	
	void printAll() {
		System.out.printf("제목: %s, 저자: %s", title, author);
	}
}