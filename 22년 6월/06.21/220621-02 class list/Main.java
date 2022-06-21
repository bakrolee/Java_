import java.util.ArrayList;
import java.util.List;

// 2차원 좌표(x, y) 여러 개 관리
class Point2D {
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Point2D)) {
			return false;
		}
		Point2D other = (Point2D) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0, 0을 가지는 좌표 추가
		list.add(new Point2D(0, 0));
		// 5, 5
		list.add(new Point2D(5, 5));
		
		Point2D p = list.get(0);
		System.out.println(p);
		
		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		
		Point2D x = new Point2D(0, 0);
		// 리스트에 0,0 좌표 객체가 있는지? 
		System.out.println(list.contains(x)); // 그냥 쓰면 참조가 다르기에 equals를 재정의 필요!
		
		// 리스트에 0,0 좌표 객체의 인덱스는?
		System.out.println(list.indexOf(x));
		
		System.out.println(list.remove(x)); // equals를 재정의 했기에 지우는 것도 똑같이 적용됨.
		System.out.println(list);
		
	}
}








