// 2번
// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드 : 같은 값이어도 서식 2가지로 다르게 출력할 수 있게
//        eg. 1번 : "2022-05-27",  2번 : "05/27/22"

public class Date {
	int year;
	int month;
	int day;
	
	void printDate1() {
		System.out.printf("%4d-%02d-%2d\n", year, month, day);
	}
	void printDate2() {
		System.out.printf("%2d/%02d/%2d\n", day, month, year % 100);
	}
}