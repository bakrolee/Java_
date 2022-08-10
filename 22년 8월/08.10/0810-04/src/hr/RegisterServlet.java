package hr;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonDAO dao = new PersonDAO();
		
		String name = req.getParameter("name");
		int age = Integer.valueOf(req.getParameter("age"));
		String email = req.getParameter("email");
		
		try {
			dao.regiPerson(name, age, email);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			resp.sendRedirect(req.getContextPath() + "/list");
		}
	}
}
