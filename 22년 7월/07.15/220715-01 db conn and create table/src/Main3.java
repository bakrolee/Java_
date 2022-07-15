import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
	// connection 객체 만드는 메소드
	public static Connection makeConnection() {		
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return conn;
	}
	
	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate("Insert into books (title, price) values "
					+ "("+ "'" + title + "'" + ", " + price 
					+ ");");
			
			System.out.println(result + "행이 추가되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
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
		
		return result;
	}
	
	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;	// 1줄씩 볼 수 있음.
		
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from books");  // select문 실행할 때 메소드
			
			while (rs.next()) { // 1줄씩 볼 수 있음. 다음줄(행) 없으면 false
				int id = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.printf("%d, %s, %d \n", id, title, price);
			};	
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
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
	
	
	public static void main(String[] args) {
//		insertBook("새로운 책", 14000);
//		insertBook("새로운 책2", 22000);
		selectAllBook();
	}
}









