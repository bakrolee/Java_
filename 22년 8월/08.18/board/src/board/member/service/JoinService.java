package board.member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import board.jdbc.ConnectionProvider;
import board.member.dao.MemberDao;
import board.member.model.Member;

public class JoinService {
	private MemberDao memberDao = new MemberDao();
	
	public void join(JoinRequest joinReq) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			Member member = memberDao.selectById(conn, joinReq.getId());
			if (member != null) {
				conn.rollback();
				throw new DuplicateIdException();
			}
			
			memberDao.insert(conn, new Member(joinReq.getId(), joinReq.getName(), 
					joinReq.getPassword(), new Date()));
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
