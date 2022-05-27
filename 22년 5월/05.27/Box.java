// 객체 만들기1

public class Box {  	// 박스(=만들고 싶은 객체)를 코드화 시키길 원함.
	// 값/'상태'
	// - 박스의 가로, 세로, 높이
	int length;
	int width;
	int height;
	int volume = length * width * height;
	
	// 메소드/'기능' or 동작
	public void printAllState() {
		System.out.println(width);  // 필드는 클래스 범위 전체 안에서 사용할 수 있는 특징있음 -> 고로 메소드 안에서도 사용 가능.
		System.out.println(length);
		System.out.println(height);
		
	}
	
	// 박스는 자기 자신의 부피를 구해서 정수형 값으로
	// 알려줄 수 있음. (반환)
	public int getVolume() {
		return length * width * height;  
		// 파라미터에 입력할 필요 없는게 이미 자기의 값을 알고있기 때문
		// 박스로 만들어진 인스턴스들은 다 자기자신의 가로, 세로, 높이 값을 다 알고있다. 
		// 그래서 자기가 가지고 있는 값으로 계산을 하면 됨.
	}
}