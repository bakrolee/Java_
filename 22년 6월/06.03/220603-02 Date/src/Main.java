import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		// java.utli.Calender
/*		Calendar now = Calendar.getInstance();
		
  		System.out.println(now.get(Calendar.YEAR)); 
		System.out.println(now.get(Calendar.MONTH) + 1); 
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); 
		System.out.println(now.get(Calendar.DAY_OF_WEEK));  // 요일
*/		
		// 1.8 부터는 java.time.LocalDate
		LocalDate now = LocalDate.now();
		System.out.println(now.getYear());
		
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());

		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());  // 요일
		System.out.println(now.getDayOfWeek().getValue());  // value : 월요일 = 1, 일요일 = 7
	}
}
