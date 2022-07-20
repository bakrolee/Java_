import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ko.co.greenart.dbutil.DBUtil;

public class Main {
	public static void main(String[] args) {
		
		// try resource문
		try (FileInputStream fis = new FileInputStream("")) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 여러 개
		try (Connection conn = DBUtil.getConnection();	// 일반적인 문장은 오기 힘듬. 선언 & 초기화하는 문장만 올 수 있음(AutoClosable을 구현하고 있는)
				PreparedStatement pstmt = conn.prepareStatement("")){
			pstmt.setString(1, "");
			try (ResultSet rs = pstmt.executeQuery()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		Connection conn = null;
//		try {
//			conn = DBUtil.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}
