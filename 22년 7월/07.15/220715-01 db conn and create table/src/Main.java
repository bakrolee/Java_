import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버가 들어있는 패키지 이름 // jdbc package driver name
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			
			// (생성) table A : 컬럼 B VARCHAR(10) PK
//			String query = "Create table A (B VarChar(10) Primary Key);";
			String query = "Drop table a";
			stmt = conn.createStatement(); // 다 사용하면 닫아줘야 함.
			
			stmt.executeUpdate(query);  // select 외에 왠만한 sql문은 사용 가능.
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {		// Connection보다 먼저 닫아주기.
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
