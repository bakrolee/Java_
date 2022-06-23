import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Main2 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("나만의 프레임");
		frame.setVisible(true);
	}
}
