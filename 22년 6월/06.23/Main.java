import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 창 만들기. 창은 기본적으로 안 보임. 크기나 위치를 정해두고 보여라 해야 보임.
		frame.setTitle("제목입니다.");
		
		// 내용 넣기
		frame.getContentPane().add(new JLabel("Hello World"));
		
		// 닫기 버튼 (눌렀을 때 프로그램 종료시키기)
		frame.setDefaultCloseOperation(3);
		
		// 사이즈 설정
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		System.out.println("asdf");
	}
}
