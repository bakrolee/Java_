import java.util.Scanner;

class Can {
	private String name;
	
	public Can(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class Main2 {
	public static final int COLA = 1;
	public static final int SPRITE = 2;
	public static final int FANTA = 3;
	
	// 자판기 메소드
	
	// 예)
	// 정수형 1 입력
	// -> 반환 타입 = Can
	// -> field "콜라"
	
	// 문자열 COLA 입력
	// -> 반환 타입 = Can
	// -> field "콜라"
	public static Can nameSoda(int n) {	
		switch (n) {
		case 1:
			return new Can("콜라");
		case 2:
			return new Can("사이다");
		case 3:
			return new Can("환타");
		default :
			return new Can("");
		}
	}
	
	public static Can nameSoda(String s) {
		Can cola = new Can("콜라");
		Can sprite = new Can("사이다");
		Can fanta = new Can("환타");
		Can none = new Can("");
		
		switch (s) {
		case "COLA":
			return cola;
		case "SPRITE":
			return sprite;
		case "FANTA":
			return fanta;
		default :
			return none;
		}
	}
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1번 콜라, 2번 사이다, 3번 환타");
//		int input = scan.nextInt();
		System.out.println(nameSoda(COLA));
		System.out.println(nameSoda("SPRITE"));
		System.out.println(nameSoda(FANTA));
		
	}
}
