package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {
	private static String dburl;
	private static String dbid;
	private static String dbpw;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("웹 어플리케이션 시작시 이벤트가 발생합니다.");
		
		// 웹 어플리케이션 첫 구동 시 필요한 설정을 할 수 있음.
		ServletContext context = sce.getServletContext();
		
		String driver = context.getInitParameter("driver");
		System.out.println("설정값 확인 : " + driver);
		dburl = context.getInitParameter("dburl");
		dbid = context.getInitParameter("dbid");
		dbpw = context.getInitParameter("dbpw");
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dburl, dbid, dbpw);
	}
}




















