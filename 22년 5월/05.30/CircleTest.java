// 203

class Point {
	private int x, y;
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// setter를 만들지 않으면, 초기 설정 이후 값을 변경할 수 없음. (setter 응용)
}

class Circle {
	private int radius = 0;
	private Point center;
	
	//생성자
	public Circle(Point p, int r) {  
		this.center = p;
		radius = r;
	} 
	
	// 중심점을 getter를 통해 
	public Point getPoint() {
		return center;
	}
	public void setPoint(Point p) {
		center = p;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		// Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(c.getPoint());
	}
}