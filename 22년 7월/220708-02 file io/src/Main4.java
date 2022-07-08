import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		PrintWriter pw = null;	// 포장해주는 클래스
		
		try {
			pw = new PrintWriter(new FileWriter(file));
			
			pw.println("문자열 한줄을 출력합니다.");  // 어떤 타입을 받으면 한 줄을 출력해주는 메소드.
			pw.println(10);
			pw.println(15.15);
			pw.flush();	// 
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();	// 포장해주는 껍데기만 닫아주면, 안의 내용들 일일이 닫을 필요는 없다.
			}
		}
	}
}
