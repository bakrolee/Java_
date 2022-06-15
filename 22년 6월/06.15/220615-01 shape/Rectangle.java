public class Rectangle extends Shape {
	private int length;
	private int height;
	
	public Rectangle(int x, int y, int lenght, int height) {
		super(x, y);
		this.length = lenght;
		this.height = height;
	}
	
	@Override
	public int getArea() {
		return length * height;
	}
	
	public int getLenght() {
		return length;
	}
	public void setLenght(int lenght) {
		this.length = lenght;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
