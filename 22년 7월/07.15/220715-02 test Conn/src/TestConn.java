import ko.co.greenart.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class TestConn {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			
			System.out.println("실행흐름 2");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인 : " + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
