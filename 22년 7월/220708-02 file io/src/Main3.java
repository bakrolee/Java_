import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
//			fis = new FileInputStream(new File("d:\\filetest\\practice.txt"));
//			fis.read();
			
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length(); // 파일의 크기(바이트 단위)를 long값으로 알려줌.
			byte[] buf = new byte[length];
			
			fis = new FileInputStream(file);
			fis.read(buf); // 파라미터에 바이트 배열 넣으면 -> 파라미터(buf)를 받아서 그 배열의 길이값만큼 읽고, 그 값을 buf에 하나 하나 넣어줌.
//			fis.read(buf, 0, length); // 위를 풀어 쓴 것. 읽는 범위 직접 지정.
			
			String result = new String(buf);
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
