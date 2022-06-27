import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.RED);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.BLUE);
		
//		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, red, blue);
//		// 가로로 쪼갤건지, 세로로 쪼갤건지 생성할때 선택
//		split.setDividerLocation(150);
//		add(split);
		
		JTabbedPane tab = new JTabbedPane();
		tab.add("빨강", red);
		tab.add("파랑", blue);
		add(tab);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
