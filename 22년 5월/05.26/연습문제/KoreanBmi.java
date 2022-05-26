// 4. 키 (실수, 미터단위)와 몸무게(실수, kg단위)를 전달받아
// 한국기준 BMI 지수(실수) 구해 반환하는 메소드
// BMI = (몸무게) / (키)^2

public class KoreanBmi {
	public static double bmi(double height, double weight) {
		return weight / (height * height);
	}
	
	public static void main(String[] args) {
		double h = 1.82;
		double w = 70.8;
		double result = bmi(h, w);
		
		System.out.println(result);
	}
}