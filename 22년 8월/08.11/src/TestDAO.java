import java.sql.SQLException;

import hr.PersonDAO;
import hr.PersonValidator;

public class TestDAO {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		
		try {
			int result = dao.insert("둘리", 22, "email@naver.com");
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
