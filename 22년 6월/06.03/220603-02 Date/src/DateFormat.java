//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();  // 캘린더는 시간, 날짜 둘 다 표현 가능. 객체
//		Date date = cal.getTime();  // 날짜 불러오는 메소드
//		
//		SimpleDateFormat dateFromat = new SimpleDateFormat("yyyy-MM-dd");  // 문자열 변환 클래스
//		String result = dateFromat.format(date);
//		System.out.println(result);
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
	}
}
