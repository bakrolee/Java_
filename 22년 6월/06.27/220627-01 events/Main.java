import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {
		MouseListener listener = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
//				System.out.println("마우스 버튼을 땜");
			}
			@Override
			public void mousePressed(MouseEvent e) {
//				System.out.println("마우스 버튼을 누름");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("EXIT!!");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("엔터~~~~~");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println("1번");
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3번");
					break;
				}
				
				System.out.println("왼쪽버튼인가요? " + SwingUtilities.isLeftMouseButton(e));
				
				
						
				if (e.getClickCount() == 2) {
					System.out.println("더블 클릭!!");
				}
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 웁직입니다~" + e.getX() + ", " + e.getY());
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		};
		
		JPanel pnl = new JPanel();
		
		pnl.addMouseMotionListener(motion);
//		pnl.addMouseListener(listener);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
