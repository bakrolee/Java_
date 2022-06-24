import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;

public class Main4 extends JFrame{
	private JRadioButton rdbToInch;
	private JRadioButton rdbToCm;


	public Main4() {
		JPanel pnl = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel();
		rdbToInch = new JRadioButton("cm → inch");
		rdbToCm = new JRadioButton("inch → cm");
		JButton btn = new JButton("변환");
		JTextField tf = new JTextField(10);
		JLabel lbl = new JLabel("결과");
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbToInch);
		group.add(rdbToCm);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String value = tf.getText();
				Double result = convert(value);
				lbl.setText(String.format("%.5f", result));
			}
		});
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.X_AXIS));
		
		Component glue = Box.createGlue();
		pnl.add(glue);
		pnl2.add(rdbToInch);
		pnl2.add(rdbToCm);
		pnl2.add(btn);
		pnl3.add(tf);
		pnl3.add(lbl);
		
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(box);
		
		pnl.add(pnl2);
		pnl.add(pnl3);
		
		add(pnl);
		setSize(400, 170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// 1인치 = 2.54cm
	public Double convert(String s) {
		Double d = Double.valueOf(s);
		if (rdbToInch.isSelected()) {
			return d * 2.54;
		} else {
			return d / 2.54;
		}
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
