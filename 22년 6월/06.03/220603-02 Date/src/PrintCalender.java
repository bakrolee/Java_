import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;


/*
 * 달력 출력하는 프로그램
 * 
 * 예시)
 * 오늘 : 2022-06-03 금
 * 일   월   화   수   목   금   토
 *    01
 *       02   
 *          01 02 03 04
 * 05 06 07 08 09 10 11
 * 12 13 14 15 16 17 18
 * 19 20 21 22 23 24 25
 * 26 27 28 29 30
 * 
 */

// 필요한 상태 : 이번달, 1일의 요일, 마지막 요일(한달에 몇 일이나 있는지)

public class PrintCalender {
	private LocalDate firstDay = LocalDate.of(2022, 6, 1);
	private LocalDate lastDay = LocalDate.of(2022, 6, 30);
	
	// 출력해야할 것
	// 1. "오늘 :" 현재 날짜(메소드) + 현재요일(메소드)
	
		// 0) 현재 날짜
	private LocalDate today = LocalDate.now();
	
		// 1) 년월일
	public String getFormat(LocalDate d) {
		DateTimeFormatter todayFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String todayResult = todayFormat.format(d);
		return todayResult;
	}
		// 2) 요일(한글)
	public String getDay(LocalDate d) {
		DayOfWeek dayOfWeek = d.getDayOfWeek();
		String toDay = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
		return toDay;
	}
		// 3) 출력
	public void printToday() {
		System.out.printf("오늘: %s %s\n", getFormat(today), getDay(today));
		
	}
	
	
	// 2. "일 월 화 수 목 금 토"
	public void printWeek() {
		System.out.println("일   월   화   수   목   금   토");
	}
	
	// 3. 01 02 03 ... 월별 날짜 표기하기
	// 요일 - 좌표고
	// 숫자는 좌표에 따라 표기하게
	
	// 표현하고 싶은 논리 흐름: 요일의 첫날 -> 요일로 변환 -> 숫자로 변환 == 7(일), 1, 2, ... 6(토)까지 비교 -> 같으면 그다음출력, 다
	public int getDayNum(LocalDate d) {
		DayOfWeek dayOfWeek = d.getDayOfWeek();
		int number = dayOfWeek.getValue();
		return number;
	}
	
	public void printSpace(int i) {
		switch (i) {
		case 1:
			System.out.printf("   %02d ", 1);
			break;
		case 2:
			System.out.printf("      %02d ", 1);
			break;
		case 3:
			System.out.printf("         %02d ", 1);
			break;
		case 4:
			System.out.printf("            %02d ", 1);
			break;
		case 5:
			System.out.printf("               %02d ", 1);
			break;
		case 6:
			System.out.printf("                     %02d ", 1);
			break;
		case 7:
			System.out.printf("%02d ", 1);
			break;
		}
	}
	
	public void printMonth() {
		for (int i = 1; i <= lastDay.getDayOfMonth(); i++) {
			if (i == 1) {
				switch (getDayNum(firstDay)) {
					case 1:
						System.out.printf("   %02d ", 1);
						break;
					case 2:
						System.out.printf("      %02d ", 1);
						break;
					case 3:
						System.out.printf("         %02d ", 1);
						break;
					case 4:
						System.out.printf("            %02d ", 1);
						break;
					case 5:
						System.out.printf("               %02d ", 1);
						break;
					case 6:
						System.out.printf("                     %02d ", 1);
						break;
					case 7:
						System.out.printf("%02d ", 1);
						break;
				}
			}
			else {
				System.out.printf("%02d ", (i));
				if (getDayNum(firstDay.plusDays(i)) == 7) {
					System.out.println();
				}
			}
		}
	}
}
