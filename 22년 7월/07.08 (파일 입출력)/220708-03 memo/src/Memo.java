import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.filechooser.FileFilter;

public class Memo extends JFrame implements ActionListener {
	private JButton btnOpen;
	private JButton btnSave;
	private JTextArea ta;
	
	private FileFilter filter = new FileFilter() {
		@Override
		public String getDescription() {
			return "텍스트 파일";
		}
		
		@Override
		public boolean accept(File f) {
			if (f.isDirectory()) {
				return true;
			}
			return f.getName().endsWith(".txt");
		}
	};

	public Memo() {
		JPanel pnl = new JPanel();
		btnOpen = new JButton("열기");
		btnSave = new JButton("저장");
		ta = new JTextArea();

		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.WEST, btnSave, 19, SpringLayout.EAST, ta);
		sl_pnl.putConstraint(SpringLayout.EAST, btnSave, -27, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, ta, 0, SpringLayout.NORTH, btnOpen);
		sl_pnl.putConstraint(SpringLayout.NORTH, btnSave, 54, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, ta, -27, SpringLayout.SOUTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, btnOpen, 0, SpringLayout.WEST, btnSave);
		sl_pnl.putConstraint(SpringLayout.SOUTH, btnOpen, -10, SpringLayout.NORTH, btnSave);
		sl_pnl.putConstraint(SpringLayout.EAST, btnOpen, 0, SpringLayout.EAST, btnSave);
		sl_pnl.putConstraint(SpringLayout.EAST, ta, -128, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, ta, 22, SpringLayout.WEST, pnl);
		pnl.setLayout(sl_pnl);

		

		pnl.add(btnOpen);
		pnl.add(btnSave);
		pnl.add(ta);

		getContentPane().add(pnl);
		setSize(471, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(filter);
		
		// 열기
		if (e.getSource() == btnOpen) {
			int result = chooser.showOpenDialog(null);
			if (result == JFileChooser.APPROVE_OPTION) {
				File file = chooser.getSelectedFile();
				BufferedReader br = null;
				ta.setText("");
				try {
					br = new BufferedReader(new FileReader(file));
					String openTxt = "";
					String line;
					while ((line = br.readLine()) != null) {
						openTxt += line + "\n";
					}
					ta.setText(openTxt);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}

			// 저장
		} else {
			int result = chooser.showSaveDialog(null);
			if (result == JFileChooser.APPROVE_OPTION) {
				File file = chooser.getSelectedFile();
				PrintWriter pw = null;
				try {
					pw = new PrintWriter(file);
					String inputAll = ta.getText();
					pw.println(inputAll);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} finally {
					if (pw != null) {
						pw.close();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}
}
