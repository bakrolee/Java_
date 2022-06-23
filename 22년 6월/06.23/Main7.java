import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main7 extends JFrame {
	private int a;
	private int b;
	
	public Main7() {
		JPanel mainPnl = new JPanel();
		JPanel subPnl = new JPanel();
		JPanel quizPnl = new JPanel();
		JPanel anwerPnl = new JPanel();

		JTextField input = new JTextField(20);
		JButton check = new JButton("확인");
		JTextField result = new JTextField(10);
		
		JLabel q = new JLabel("Quiz");
		q.setSize(50, 50);
		mainPnl.add(Box.createGlue());
		mainPnl.add(q);
		mainPnl.add(Box.createGlue());
		
		JLabel quiz = new JLabel(repeatQuiz());
		quiz.setFont(quiz.getFont().deriveFont(30.0F));
		quizPnl.add(quiz);
		anwerPnl.add(input);
		anwerPnl.add(check);
		anwerPnl.add(result);
		
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();
				if (s.equals(String.valueOf(a + b))) {
					result.setText("정답입니다.");
					quiz.setText(repeatQuiz());
				} else {
					result.setText("오답입니다.");
				}
			}
		});
		
		BoxLayout box = new BoxLayout(mainPnl, BoxLayout.Y_AXIS);
		mainPnl.setLayout(box);
//		mainPnl.setSize(300, 300);
		BoxLayout box2 = new BoxLayout(subPnl, BoxLayout.Y_AXIS);
		subPnl.setLayout(box2);
		
		subPnl.add(quizPnl);
		subPnl.add(anwerPnl);
		mainPnl.add(subPnl);
		mainPnl.add(Box.createGlue());
		add(mainPnl);
		
		pack();
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public String repeatQuiz() {
		Random r = new Random();
		a = 1 + r.nextInt(10);
		b = 1 + r.nextInt(10);
		String quiz = a + " + " + b + " = ?";
		return quiz;
	}
	
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}









