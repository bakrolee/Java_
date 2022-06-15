// 도형 
// (중심점)
// x좌표 
// y좌표

// 넓이 구할 수 있음. -> 문제: 어떤 도형인지 알 수 없기에 (추상적) 한 문장으로 동작을 만들 수 없다.

public abstract class Shape { // 추상클래스
	int x;
	int y;
	
	// 추상메소드 - 메소드 Body X, Head만 존재
		public abstract int getArea();
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
}
