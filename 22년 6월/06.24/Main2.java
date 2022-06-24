import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Main2 extends JFrame{
	private int price;
	private JLabel result;
	
	public Main2() {
		super("중국집 메뉴");
		JPanel pnl = new JPanel();
		JCheckBox cb1 = new JCheckBox("짜장면 : 5000원");
		JCheckBox cb2 = new JCheckBox("짬뽕 : 6000원");
		JCheckBox cb3 = new JCheckBox("탕수육 : 13000원");
		result = new JLabel(String.valueOf(price) + "원");
		
		JButton cbAll = new JButton("전체 선택");
		JButton cbReset = new JButton("전체 취소");
		
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, result, 4, SpringLayout.NORTH, cb2);
		sl_pnl.putConstraint(SpringLayout.EAST, result, -69, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, cbAll, 33, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, cbReset, 0, SpringLayout.NORTH, cbAll);
		sl_pnl.putConstraint(SpringLayout.WEST, cbReset, 31, SpringLayout.EAST, cbAll);
		sl_pnl.putConstraint(SpringLayout.NORTH, cb1, 23, SpringLayout.SOUTH, cbAll);
		sl_pnl.putConstraint(SpringLayout.EAST, cbAll, 0, SpringLayout.EAST, cb1);
		sl_pnl.putConstraint(SpringLayout.NORTH, cb3, 6, SpringLayout.SOUTH, cb2);
		sl_pnl.putConstraint(SpringLayout.WEST, cb3, 0, SpringLayout.WEST, cb1);
		sl_pnl.putConstraint(SpringLayout.WEST, cb2, 52, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, cb1, 52, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, cb2, 6, SpringLayout.SOUTH, cb1);
		pnl.setLayout(sl_pnl);
		
		pnl.add(cbAll);
		pnl.add(cbReset);
		pnl.add(cb1);
		pnl.add(cb2);
		pnl.add(cb3);
		pnl.add(result);
		
		checkMenu(cb1, 5000); // 짜장면
		checkMenu(cb2, 6000); // 짬뽕
		checkMenu(cb3, 13000); // 탕수육
		
		cbAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cb1.setSelected(true);
				cb2.setSelected(true);
				cb3.setSelected(true);
			}
		});
		
		cbReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cb1.setSelected(false);
				cb2.setSelected(false);
				cb3.setSelected(false);
			}
		});
		
		
		getContentPane().add(pnl);
		
		JLabel lblNewLabel = new JLabel("총합 =");
		sl_pnl.putConstraint(SpringLayout.WEST, result, 6, SpringLayout.EAST, lblNewLabel);
		sl_pnl.putConstraint(SpringLayout.NORTH, lblNewLabel, 4, SpringLayout.NORTH, cb2);
		sl_pnl.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, cbReset);
		pnl.add(lblNewLabel);
		setSize(380, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public void checkMenu(JCheckBox cb, int menu) {
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					price += menu;
				} else {
					price -= menu;
				}
				result.setText(String.valueOf(price) + "원");
			}
		});
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
