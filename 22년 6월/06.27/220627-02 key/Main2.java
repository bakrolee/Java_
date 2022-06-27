import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame{
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
		
		JTextArea ta = new JTextArea(20, 20);
		JScrollPane scrl = new JScrollPane(ta);
		
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
		add(scrl, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				// 키가 눌러졌을 때 getID를 호출하면 글자가 쳐졌는지 아닌지 확인할 수 있음.
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
