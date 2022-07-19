import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ko.co.greenart.dbutil.DBUtil;

// restaurants 테이블에 대한 db access를 수행하는 객체 작성 후 테스트

// 메소드(입력값) : 반환값

// C(상호명, 전화번호, 주소) or C(음식점) : 행 개수		throws SQLException
// R() : List<음식점>
// R(id) : 음식점
// U(id, 새 상호명, 새 전화번호, 새 주소) or U(음식점) : 행 개수
// D(id) : 행 개수
//---------------------------------------------------------
// 여러 행의 음식점 추가

public class RestaurantAccess {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String phoneNumber = rs.getString("phoneNumber");
		String address = rs.getString("address");
		
		return new Restaurant(id, name, phoneNumber, address);
	}
	
	// 삭제
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurants WHERE id = " + id;
		
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
	public int update(Restaurant rt) throws SQLException {
		String query = "UPDATE restaurants SET name = '"+ rt.getName() +"', phoneNumber = '"+ rt.getPhoneNumber() 
														+ "', address = '"+ rt.getAddress() +"' WHERE id = " + rt.getId();
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
	
	// 검색
	public Restaurant search(int id) throws SQLException {
		String query = "SELECT * FROM restaurants WHERE id =" + id;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 추가
	public int add(Restaurant rt) throws SQLException {
		String query = "INSERT INTO restaurants (name, phoneNumber, address) "
				+ "VALUES ('"+ rt.getName() +"', '"+ rt.getPhoneNumber() +"', '"+ rt.getAddress() +"')";
		
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
	
	// 음식점 여러개 추가 -> 매개변수를 list<음식점>으로 하면 됨 -> 리스트 만드는 메소드 만들어주고...
	public String addQuery(List<Restaurant> rts) {
		StringBuilder sb = new StringBuilder();
		
		List<String> list = new ArrayList<>();
		
		// 조건 걸어서 사이즈 1개일 때는 ( // 1개보다 클 때는 , ( 로 추가하게끔 수정.
		for (int i = 0; i < rts.size(); i++) {
			if (i == 0) {
				list.add("('"+ rts.get(i).getName() + "', '");
			} else {
				list.add(", ('"+ rts.get(i).getName() + "', '");
			}
			list.add(rts.get(i).getPhoneNumber() + "', '");
			list.add(rts.get(i).getAddress() + "')");
		}
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		String str = sb.toString();
		return str;
	}
	
	
	public int someAdd(List<Restaurant> rts) throws SQLException {
		String query = "INSERT INTO restaurants (name, phoneNumber, address) VALUES " + addQuery(rts);
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
	
	// 전체 목록 보기
	public List<Restaurant> list() throws SQLException {
		String query = "SELECT * FROM restaurants";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		
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
	
	
}
