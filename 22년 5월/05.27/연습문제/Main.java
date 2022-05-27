// 위의 클래스를 테스트 할 수 있는 main메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘설에서 출력

public class Main {
	public static void main(String[] args) {
		System.out.println("1번");
		
		Book first = new Book();
		first.title = "토지";
		first.author = "박경리";
		first.printAll();
		
		
		System.out.println("\n\n2번");
		
		Date second = new Date();
		second.year = 2022;
		second.month = 5;
		second.day = 27;
		second.printDate1();
		second.printDate2();
		
		
		System.out.println("\n\n3번");
		
		Movie third = new Movie();
		third.title = "괴물";
		third.score = 8.9;
		third.director = "봉준호";
		third.year = 2006;
		third.printMovie();
	}
}