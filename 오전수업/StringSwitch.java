// p110 ~ 111 예제

public class StringSwitch {
	public static void main(String[] args) {
		String month = "february";
		
		int monthNumber;
		switch (month) {
			case "januarty":
				monthNumber = 1;
				break;
			case "february":
				monthNumber = 2;
				break;
			case "march":
				monthNumber = 3;
				break;
			default:
				monthNumber = 0;
				break;
		}
		System.out.print(monthNumber);
	}
}