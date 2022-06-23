import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main3 extends JFrame implements ActionListener {
	private JButton btnEnable;
	private JButton btnDisable;
	private List<JButton> list;
	
	public Main3() {
		super("버튼 활성화 테스트~");
		list = new ArrayList<>();
		
		JPanel pnl = new JPanel();
		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
//		JButton btnNotShown = new JButton("보이나?");
		
		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
//		btnDisable.setEnabled(false);
//		btnNotShown.setVisible(false);
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
//		pnl.add(btnNotShown); 
		for (int i = 1; i <= 5; i++) {
			JButton btn = new JButton(String.valueOf(i));
			list.add(btn);
			pnl.add(btn);
		}
		
		add(pnl);
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			for (JButton btn : list) {
				btn.setEnabled(true);
			}
		} else {
			for (JButton btn : list) {
				btn.setEnabled(false);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
