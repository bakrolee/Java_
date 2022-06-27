import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 이미지 들고오기
public class Main4 extends JFrame{
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit(); // 얘가 있으면 이미지 파일을 쉽게 들고올 수 있음.
		
		URL url = Main4.class.getClassLoader().getResource("images/어피치.png");
		Image image = kit.getImage(url);
		URL url2 = Main4.class.getClassLoader().getResource("images/어피치2.png");
		Image image2 = kit.getImage(url2);
		
//		Image image = kit.getImage("어피치.png");
//		Image image2 = kit.getImage("어피치2.png");
		
		JLabel lbl = new JLabel(new ImageIcon(image)); // 이미지 파일도 담을 수 있음.
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(new ImageIcon(image2));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(new ImageIcon(image));
			}
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
