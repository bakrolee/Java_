package kr.co.greenart.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class UserRepositoryMySQL implements UserRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private UserRowMapper mapper = new UserRowMapper();
	
	private class UserRowMapper implements RowMapper<User> {
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			// 한 행에 대해서만 작성해주면, 자동으로 여러줄 에 대해 매핑을 해줌.
			return new User(id, name, age);
		}
	}

	@Override
	public int add(User user) {
		return jdbcTemplate.update("INSERT INTO users (name, age) VALUES (?, ?)"
				, user.getName()
				, user.getAge());
	}

	@Override
	public List<User> list() {
		return jdbcTemplate.query("SELECT * FROM users", mapper);
	}
}
