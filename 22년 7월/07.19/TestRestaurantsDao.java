import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();
		
		try {
//			int result = dao.create("테스트중1", "1234-5555", "서울 부산 대구 대전");
//			System.out.println(result == 1);
			
//			int result = dao.update(19, "테스트중2", "1234-5555", "서울 부산 대구 대전");
//			System.out.println(result == 1);
//			System.out.println(dao.read(19));
			
//			int result = dao.delete(17);
//			System.out.println(result == 1);
			
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			int[] result = impl.create(Arrays.asList(
					new Restaurant(0, "배치1", "01111", "배치주소1121")
					,new Restaurant(0, "배치2", "0222", "배치주소2222")
					,new Restaurant(0, "배치3", "033", "배치주소3333")
					,new Restaurant(0, "배치4", "04444", "배치주소4444")
					));
			System.out.println(Arrays.toString(result));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
