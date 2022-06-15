// 학생 2명
// 학생은 이름, 나이 있음.
// 한국학생, 영국학생
// 공통점은 인사할 수 있음.
// 한국학생 : 안녕
// 영국학생 : hello
// 미국인 (학생x)
// 인사는 할 수 있음. 이름, 나이 없음. 인사 : wassub

public class Main2 {
	public static void main(String[] args) {
		StudentKorean g1 = new StudentKorean("한국인", 18);
		StudentBritish g2 = new StudentBritish("영국인", 17);
		American g3 = new American();
		
		Greet[] arr = new Greet[3];
		arr[0] = g1;
		arr[1] = g2;
		arr[2] = g3;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].greet();
		}
	}
}
