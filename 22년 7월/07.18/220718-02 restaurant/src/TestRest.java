import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestRest {
	public static void main(String[] args) {
		RestaurantAccess acc = new RestaurantAccess();
		int result;
		try {
			// 추가
//			result = acc.add(new Restaurant("맛집1", "010-5547-4848", "부산 부산진구 5353"));
//			System.out.println(result + "개 음식점이 추가");
			
			// 검색
//			Restaurant temp = acc.search(6);
//			System.out.println("검색결과: " + temp);
			
			// 수정
//			result = acc.update(new Restaurant(4, "수정음식점", "051-1151-1115", "부산 수정구 수정로"));
//			System.out.println("수정된 행 개수: " + result);
			
			// 삭제
//			result = acc.delete(5);
//			System.out.println("삭제된 행 개수: " + result);
			
			// 목록 보기
			List<Restaurant> list = acc.list();
			for (Restaurant r : list) {
				System.out.println(r);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
