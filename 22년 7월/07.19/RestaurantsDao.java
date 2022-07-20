import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
	int create(String name, String phoneNumber, String address) throws SQLException;
	
	// 전체 다 읽고, 목록 반환
	List<Restaurant> read() throws SQLException;
	// 1개만 읽기
	Restaurant read(int id) throws SQLException;
	
	int update(int id, String name, String phoneNumber, String address) throws SQLException;
	int delete(int id) throws SQLException;
}
