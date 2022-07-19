import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ko.co.greenart.dbutil.DBUtil;

public class BooksRepository {
	private Book resultMapping(ResultSet rs) throws SQLException {
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");
		
		return new Book(bookId, title, price);
	}
	
	// 추가
	public int add(Book book) throws SQLException { // int인 이유 : 책 1권이 추가되면 1을 반환.(insert가 잘 수행되었으면)
		String query = "INSERT INTO books (title, price) VALUES ('" + book.getTitle() +"', "+ book.getPrice() +")"; 
		// Statement는 쿼리문에 ; 없어도 자동 생성해줌. (; 생략 가능)
		System.out.println("추가: " + query);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query); // executeUpdate = 추가된 행만큼 정수형으로 반환.
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 목록 전체
	public List<Book> list() throws SQLException {
		String query = "SELECT * FROM books";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Book> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
//				int bookId = rs.getInt("bookId");
//				String title = rs.getString("title");
//				int price = rs.getInt("price");
				
//				list.add(new Book(bookId, title, price));
				list.add(resultMapping(rs));
			}
			return list;  // 얘도 됨. (이유 : 흐름상 finally 먼저 진행 후, 마지막에 return으로 실행)
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 검색 (제목)
	public List<Book> selectByTitle(String title) throws SQLException { //  책제목이 unique면 반환타입 Book
		String query = "SELECT * FROM books WHERE title = '"+ title +"'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			return list; 
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 삭제
	public int delete(int bookId) throws SQLException {
		String query = "DELETE FROM books WHERE bookId = " + bookId;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 수정
	public int update(Book book) throws SQLException {
		String query = "UPDATE books SET title = '"+ book.getTitle() 
								+"', price = "+ book.getPrice() + " WHERE bookId = " + book.getBookId();
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}









