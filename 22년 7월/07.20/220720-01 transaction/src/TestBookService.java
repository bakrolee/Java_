
public class TestBookService {
	public static void main(String[] args) {
		BookService service = new BookService(new BookDaoParamConn());
		service.insertAndUpdate("중복이름", 19999);
	}
}
