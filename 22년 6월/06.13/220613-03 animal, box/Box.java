
public class Box {
	int length;
	int width;
	int height;
	
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public int getVolume() {
		return length * width * height;
	}
}
