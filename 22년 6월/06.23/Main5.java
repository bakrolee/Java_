import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame{
	public Main5() {
		JPanel pnl = new JPanel();
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
//		pnl.setLayout(flow);
//		BorderLayout border = new BorderLayout();
//		pnl.setLayout(border);
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
//		pnl.setLayout(box);
//		GridLayout grid = new GridLayout(2, 1);
		pnl.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
//		btn1.setSize(100, 100);  // 버튼의 크기가 변하지 않음. (이유 -> FlowLayout에서 크기를 정하기 때문)
		btn1.setPreferredSize(new Dimension(300, 300));
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMaximumSize(new Dimension(300, 300));
		
		btn1.setLocation(10,30);
		btn1.setSize(200, 300);
		
		btn2.setBounds(220, 50, 70, 70); // x,y 좌표랑 사이즈 (가로,세로) 다 정의할 수 있음.
		
		pnl.add(btn1);
		pnl.add(btn2); // 센터는 생략 가능
		pnl.add(btn3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
