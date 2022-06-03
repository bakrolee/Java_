import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

// 내일 날짜 구하기

public class TestDateMethods {
	public static void main(String[] args) {
		// 내가 검색해서 찾은 방법, 정수 더한 결과를 LocalDate로 반환함.
		LocalDate now = LocalDate.now();
		LocalDate nowPlusOne = now.plusDays(1);  
		System.out.println(nowPlusOne);
		// 날짜 직접 입력하기
		LocalDate tomorrow = LocalDate.of(2022, 6, 4); 
		System.out.println(tomorrow.equals(nowPlusOne));  // .equals : 날짜 서로 같은지 확인 메소드
		
		// 캘린더 사용
		Calendar now1 = Calendar.getInstance();
		now1.add(Calendar.DAY_OF_MONTH, 1);  // 하루 더하기
//		now1.set(2022, Calendar.JUNE, 4);  // 직접입력
		
		Date date = now1.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
		
	}
}
