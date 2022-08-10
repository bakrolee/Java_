package hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	public int regiPerson(String name, int age, String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			pstmt = conn.prepareStatement("INSERT INTO hr (name, age, email) VALUES (?, ?, ?)");
			
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, email);
			
			return pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	
	public List<Person> listPeople() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Person> list = new ArrayList<>();
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			pstmt = conn.prepareStatement("SELECT * FROM hr");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String email = rs.getString("email");
				list.add(new Person(name, age, email));
			}
			return list;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
}
