import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel(null);  // null로 하면 레이아웃 매니저가 없어짐. 안의 값을 내 맘대로 조정 가능 (ex.버튼 사이즈 등...)
		pnl.setPreferredSize(new Dimension(500, 500));
		
		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);  // 왼쪽 두개는 좌표, 오른쪽 두개는 크기
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);  // 창의 크기 고정시켜둠. (사이즈 변하지 않도록)
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
