import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BooksRepository repo = new BooksRepository();
		
		int result;
		try {
//			result = repo.add(new Book("테스트용 책1", 40000));
//			System.out.println("추가 확인: " + (result == 1));
			
//			List<Book> list = repo.list();
//			System.out.println(list);
			
//			List<Book> list = repo.selectByTitle("테스트용");
//			System.out.println(list);
			
			result = repo.update(new Book(25, "자바에서 변경한 새이름", 5000));
			System.out.println(result == 1);
			
			List<Book> list = repo.selectByTitle("자바에서 변경한 새이름");
			System.out.println(list);
		} catch (SQLException e) {
			e.getErrorCode();	// 어떤 에러인지 다 알 수 있음.
			e.getSQLState();
		}
	}
}
