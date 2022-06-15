public class Triangle extends Shape {
	private int base; // 밑변
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public int getArea() {		// 부모의 추상메소드를 자식이 구체화 시켜줘야 할 의무가 있다.
		return base * height / 2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}
}
