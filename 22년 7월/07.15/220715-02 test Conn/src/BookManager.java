import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ko.co.greenart.dbutil.DBUtil;

//	도서 관리 프로그램 (my_db.books)
//	- 추가
//	- 전체 목록
//	(아이디나 제목이나 가격 등으로 검색 가능)
//	- 삭제
//	- 수정

public class BookManager {
	private List<Book> books = new ArrayList<>();
	
	// 생성 - DB책 정보 연결
	public BookManager() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "select * from books;";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				books.add(new Book(bookId, title, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookManager [books=" + books + "]";
	}
	
	// 검색기능
	public void searchBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			Scanner scan = new Scanner(System.in);
			
			String sql;
			printBooks();
			System.out.println("검색 선택. 1.ID, 2.제목, 3.가격");
			int sel = scan.nextInt();
			switch (sel) {
			case 1:
				System.out.print("id: ");
				int bookId = scan.nextInt();
				sql = "select * from books where bookId = " + bookId + ";";
				rs = stmt.executeQuery(sql);
				break;
			case 2:
				scan.nextLine();
				System.out.print("책 제목: ");
				String title = scan.nextLine();
				sql = "select * from books where title = '" + title + "';";
				rs = stmt.executeQuery(sql);
				break;
			case 3:
				System.out.print("가격: ");
				int price = scan.nextInt();
				sql = "select * from books where price = " + price + ";";
				rs = stmt.executeQuery(sql);
				break;
			}
			
			int bookId = 0;
			while (rs.next()) {
				bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println("찾은신 책");
				System.out.println(books.get(idToIndex(bookId)).toString());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 책 추가
	public void addBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("책 제목: ");
		String title = scan.nextLine();
		System.out.print("가격: ");
		int price = scan.nextInt();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			String sql = "Insert into books(title, price) values " + "(" + "'" + title + "', " + price + ");";
			stmt.executeUpdate(sql);
			
			sql = "select * from books order by bookId desc limit 1;";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int bookId = rs.getInt("bookId");
				
				books.add(new Book(bookId, title, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 전체 목록
	public void printBooks() {
		System.out.println(books);
	}
	
	// 삭제
	public void removeBook() {
		Connection conn = null;
		Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		
		printBooks();
		System.out.println("삭제할 bookId: ");
		int bookId = scan.nextInt();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			String sql = "Delete from books where bookId = " + bookId + ";";
			
			Book remBook = books.get(idToIndex(bookId));
			System.out.println("삭제될 책: " + remBook.toString());
			System.out.println("취소하려면 1");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("삭제를 취소합니다.");
			} else {
				stmt.executeUpdate(sql);
				books.remove(idToIndex(bookId));
				System.out.println("삭제 완료");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 수정하기
	public void editBook() {
		Connection conn = null;
		Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		
		printBooks();
		System.out.println("수정할 bookId: ");
		int bookId = scan.nextInt();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			System.out.println("수정할 책: " + books.get(idToIndex(bookId)).toString());
			scan.nextLine();
			System.out.print("책 제목: ");
			String title = scan.nextLine();
			System.out.print("가격: ");
			int price = scan.nextInt();
			
			String sql = "Update books set title = '" + title + "', price = " + price + " where bookId = " + bookId + ";";
			
//			System.out.println("수정할 책: " + books.get(idToIndex(bookId)).toString());
			System.out.println("취소하려면 1");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("수정을 취소합니다.");
			} else {
				stmt.executeUpdate(sql);
				books.get(idToIndex(bookId)).setTitle(title);
				books.get(idToIndex(bookId)).setPrice(price);;
				System.out.println("수정 완료");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// id로 index 찾기
	public int idToIndex(int id) {
		int index = 0;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getBookId() == id) {
				index = i;
				break;
			}
		}
		return index;
	}
}

















