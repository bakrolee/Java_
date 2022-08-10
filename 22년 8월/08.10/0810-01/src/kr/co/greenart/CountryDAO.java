package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
	public List<String> getContinents() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<String> list = new ArrayList<>();
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			pstmt = conn.prepareStatement("SELECT DISTINCT continent FROM country");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String continent = rs.getString("continent");
				list.add(continent);
			}		
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
		return list;
	}
	
	public List<Country> getCountryByContinent(String continent) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Country> list = new ArrayList<>();
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			pstmt = conn.prepareStatement("SELECT name, population FROM country WHERE continent = ? ORDER BY population DESC");
			pstmt.setString(1, continent);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("name");
				int population = rs.getInt("population");
				list.add(new Country(name, population));
			}		
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
		return list;
	}
}
