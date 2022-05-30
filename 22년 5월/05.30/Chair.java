// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 의도대로 초기화 할 수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보기

public class Chair {
	String production;
	String date;
	int price;
	String model;
	
	public Chair (String p, String d, int pr, String m) {
		production = p;
		date = d;
		price = pr;
		model = m;
	}
	
	void printAll() {
		System.out.println("제조사: " + production);
		System.out.println("생산일자: " + date);
		System.out.println("가격: " + price);
		System.out.println("모델명: " + model);
	}
	
	public static void main(String[] args) {
		Chair c = new Chair("시디즈", "2016-09-05", 374000, "T-50");
		Chair c2 = new Chair("허먼밀러", "2019-10-21", 2120000, "뉴 에어론");
		
		c2.printAll();
	}
}