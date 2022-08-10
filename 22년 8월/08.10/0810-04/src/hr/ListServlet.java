package hr;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonDAO dao = new PersonDAO();
		List<Person> list = new ArrayList<>();
		
		try {
			list = dao.listPeople();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			req.setAttribute("list", list);
			req.getRequestDispatcher("listpeople.jsp").forward(req, resp);;
		}
	}
}
