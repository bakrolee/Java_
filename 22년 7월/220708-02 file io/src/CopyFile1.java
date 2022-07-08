import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;  // 파일을 bite 단위로 읽어주는 클래스
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.txt");	// 해당 파일 없으면 에러.
//			in = new FileInputStream(new File("input.txt"));
			out = new FileOutputStream("output.txt");	// 
			int c;
			
			while((c = in.read()) != -1) {	// read는 int형으로 내용을 가지고 옴. -1 = 더 가지고 올 게 없을 때 갖고 오는 값.
				out.write(c);	// 메소드 실행시, 해당 파일이 없으면 만들어 줌. 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
	}
}
